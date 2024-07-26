package com.example.telemedicina.application.port.out;

import com.example.telemedicina.domain.HorarioDisponivel;

import java.util.List;

public interface HorarioDisponivelRepositoryPort {
    HorarioDisponivel save(HorarioDisponivel horarioDisponivel);

    List<HorarioDisponivel> findByMedicoId(Long medicoId);

    List<HorarioDisponivel> findByMedicoIdAndDiaSemana(Long medicoId, String diaSemana);
}
