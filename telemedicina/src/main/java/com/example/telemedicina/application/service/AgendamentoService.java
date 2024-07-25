package com.example.telemedicina.application.service;

import com.example.telemedicina.application.port.in.CreateAgendamentoUseCase;
import com.example.telemedicina.application.port.in.ListAgendamentosUseCase;
import com.example.telemedicina.application.port.out.AgendamentoRepositoryPort;
import com.example.telemedicina.domain.Agendamento;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgendamentoService implements CreateAgendamentoUseCase, ListAgendamentosUseCase {

    private final AgendamentoRepositoryPort agendamentoRepositoryPort;

    public AgendamentoService(AgendamentoRepositoryPort agendamentoRepositoryPort) {
        this.agendamentoRepositoryPort = agendamentoRepositoryPort;
    }

    @Override
    public Agendamento criarAgendamento(Agendamento agendamento) {
        return agendamentoRepositoryPort.save(agendamento);
    }

    @Override
    public List<Agendamento> listarAgendamentos() {
        return agendamentoRepositoryPort.findAll();
    }
}
