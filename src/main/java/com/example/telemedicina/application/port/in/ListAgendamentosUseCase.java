package com.example.telemedicina.application.port.in;

import com.example.telemedicina.domain.Agendamento;

import java.util.List;

public interface ListAgendamentosUseCase {
    List<Agendamento> listarAgendamentos();
}
