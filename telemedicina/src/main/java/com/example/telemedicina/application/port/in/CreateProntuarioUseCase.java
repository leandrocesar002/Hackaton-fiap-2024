package com.example.telemedicina.application.port.in;

import com.example.telemedicina.domain.Prontuario;

public interface CreateProntuarioUseCase {
    Prontuario criarProntuario(Prontuario prontuario);
}
