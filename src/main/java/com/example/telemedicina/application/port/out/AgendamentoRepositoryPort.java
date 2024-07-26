package com.example.telemedicina.application.port.out;

import com.example.telemedicina.domain.Agendamento;

import java.util.List;

public interface AgendamentoRepositoryPort {
    Agendamento save(Agendamento agendamento);

    List<Agendamento> findByMedicoId(Long medicoId);

    List<Agendamento> findByPacienteId(Long pacienteId);

    Agendamento findById(Long id);
}
