package com.example.telemedicina.application.service;

import com.example.telemedicina.application.port.in.CreateAgendamentoUseCase;
import com.example.telemedicina.application.port.in.ListAgendamentosUseCase;
import com.example.telemedicina.application.port.in.UpdateAgendamentoStatusUseCase;
import com.example.telemedicina.application.port.out.AgendamentoRepositoryPort;
import com.example.telemedicina.application.port.out.HorarioDisponivelRepositoryPort;
import com.example.telemedicina.domain.Agendamento;
import com.example.telemedicina.domain.HorarioDisponivel;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.time.format.TextStyle;
import java.util.List;
import java.util.Locale;

@Service
public class AgendamentoService implements CreateAgendamentoUseCase, ListAgendamentosUseCase, UpdateAgendamentoStatusUseCase {

    private final AgendamentoRepositoryPort agendamentoRepositoryPort;
    private final HorarioDisponivelRepositoryPort horarioDisponivelRepositoryPort;

    public AgendamentoService(AgendamentoRepositoryPort agendamentoRepositoryPort, HorarioDisponivelRepositoryPort horarioDisponivelRepositoryPort) {
        this.agendamentoRepositoryPort = agendamentoRepositoryPort;
        this.horarioDisponivelRepositoryPort = horarioDisponivelRepositoryPort;
    }

    @Override
    public Agendamento criarAgendamento(Agendamento agendamento) {
        if (!isHorarioDisponivel(agendamento)) {
            throw new IllegalArgumentException("Horário indisponível para o médico selecionado.");
        }
        agendamento.setStatus(Agendamento.Status.AGENDADO);
        return agendamentoRepositoryPort.save(agendamento);
    }

    @Override
    public List<Agendamento> listarAgendamentosPorMedico(Long medicoId) {
        return agendamentoRepositoryPort.findByMedicoId(medicoId);
    }

    @Override
    public List<Agendamento> listarAgendamentosPorPaciente(Long pacienteId) {
        return agendamentoRepositoryPort.findByPacienteId(pacienteId);
    }

    @Override
    public Agendamento aceitarAgendamento(Long id) {
        Agendamento agendamento = agendamentoRepositoryPort.findById(id);
        if (agendamento != null) {
            agendamento.setStatus(Agendamento.Status.ACEITO);
            return agendamentoRepositoryPort.save(agendamento);
        }
        return null;
    }

    @Override
    public Agendamento recusarAgendamento(Long id) {
        Agendamento agendamento = agendamentoRepositoryPort.findById(id);
        if (agendamento != null) {
            agendamento.setStatus(Agendamento.Status.RECUSADO);
            return agendamentoRepositoryPort.save(agendamento);
        }
        return null;
    }

    private boolean isHorarioDisponivel(Agendamento agendamento) {
        String diaSemana = agendamento.getDataHora().getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("pt", "BR"));
        List<HorarioDisponivel> horariosDisponiveis = horarioDisponivelRepositoryPort.findByMedicoIdAndDiaSemana(agendamento.getMedicoId(), diaSemana);
        LocalTime horaAgendamento = agendamento.getDataHora().toLocalTime();
        return horariosDisponiveis.stream()
                .anyMatch(h -> !horaAgendamento.isBefore(h.getHoraInicio()) && !horaAgendamento.isAfter(h.getHoraFim()));
    }
}
