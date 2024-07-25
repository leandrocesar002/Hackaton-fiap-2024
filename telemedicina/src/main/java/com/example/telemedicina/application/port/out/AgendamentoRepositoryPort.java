package com.example.telemedicina.application.port.out;

import com.example.telemedicina.domain.Agendamento;

import java.util.List;
import java.util.UUID;

public interface AgendamentoRepositoryPort {
    Agendamento save(Agendamento agendamento);
    List<Agendamento> findAll();
    Agendamento findById(UUID id);
    void deleteById(UUID id);
}
