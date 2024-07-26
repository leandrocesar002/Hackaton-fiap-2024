package com.example.telemedicina.application.port.in;

import com.example.telemedicina.domain.HorarioDisponivel;

import java.util.List;

public interface ListHorarioDisponivelUseCase {
    List<HorarioDisponivel> listarHorariosDisponiveis(Long medicoId);
}
