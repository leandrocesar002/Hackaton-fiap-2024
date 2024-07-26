package com.example.telemedicina.adapter.out.persistence;

import com.example.telemedicina.application.port.out.AgendamentoRepositoryPort;
import com.example.telemedicina.domain.Agendamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AgendamentoRepositoryAdapter implements AgendamentoRepositoryPort {

    @Autowired
    private AgendamentoJpaRepository agendamentoJpaRepository;

    @Override
    public Agendamento save(Agendamento agendamento) {
        return agendamentoJpaRepository.save(agendamento);
    }

    @Override
    public List<Agendamento> findByMedicoId(Long medicoId) {
        return agendamentoJpaRepository.findByMedicoId(medicoId);
    }

    @Override
    public List<Agendamento> findByPacienteId(Long pacienteId) {
        return agendamentoJpaRepository.findByPacienteId(pacienteId);
    }

    @Override
    public Agendamento findById(Long id) {
        return agendamentoJpaRepository.findById(id).orElse(null);
    }
}
