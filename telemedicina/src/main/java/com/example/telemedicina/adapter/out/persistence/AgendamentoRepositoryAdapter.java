package com.example.telemedicina.adapter.out.persistence;

import com.example.telemedicina.application.port.out.AgendamentoRepositoryPort;
import com.example.telemedicina.domain.Agendamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class AgendamentoRepositoryAdapter implements AgendamentoRepositoryPort {

    private final AgendamentoJpaRepository agendamentoJpaRepository;

    @Autowired
    public AgendamentoRepositoryAdapter(AgendamentoJpaRepository agendamentoJpaRepository) {
        this.agendamentoJpaRepository = agendamentoJpaRepository;
    }

    @Override
    public Agendamento save(Agendamento agendamento) {
        return agendamentoJpaRepository.save(agendamento);
    }

    @Override
    public List<Agendamento> findAll() {
        return agendamentoJpaRepository.findAll();
    }

    @Override
    public Agendamento findById(UUID id) {
        return agendamentoJpaRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(UUID id) {
        agendamentoJpaRepository.deleteById(id);
    }
}
