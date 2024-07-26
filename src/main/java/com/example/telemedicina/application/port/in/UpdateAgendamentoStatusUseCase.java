package com.example.telemedicina.application.port.in;

import com.example.telemedicina.domain.Agendamento;

public interface UpdateAgendamentoStatusUseCase {
    Agendamento aceitarAgendamento(Long id);

    Agendamento recusarAgendamento(Long id);
}
