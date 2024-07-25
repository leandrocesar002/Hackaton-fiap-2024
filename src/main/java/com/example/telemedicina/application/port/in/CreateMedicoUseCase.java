package com.example.telemedicina.application.port.in;

import com.example.telemedicina.domain.Medico;

public interface CreateMedicoUseCase {
    Medico criarMedico(Medico medico);
}
