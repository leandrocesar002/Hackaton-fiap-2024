package com.example.telemedicina.application.port.in;

import com.example.telemedicina.domain.Agendamento;

public interface CreateAgendamentoUseCase {
    Agendamento criarAgendamento(Agendamento agendamento);
}
