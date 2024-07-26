package com.example.telemedicina.application.port.in;

import com.example.telemedicina.domain.HorarioDisponivel;

public interface CreateHorarioDisponivelUseCase {
    HorarioDisponivel criarHorarioDisponivel(HorarioDisponivel horarioDisponivel);
}
