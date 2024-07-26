package com.example.telemedicina.application.service;

import com.example.telemedicina.application.port.in.CreateHorarioDisponivelUseCase;
import com.example.telemedicina.application.port.in.ListHorarioDisponivelUseCase;
import com.example.telemedicina.application.port.out.HorarioDisponivelRepositoryPort;
import com.example.telemedicina.domain.HorarioDisponivel;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;

@Service
public class HorarioDisponivelService implements CreateHorarioDisponivelUseCase, ListHorarioDisponivelUseCase {

    private final HorarioDisponivelRepositoryPort horarioDisponivelRepositoryPort;

    public HorarioDisponivelService(HorarioDisponivelRepositoryPort horarioDisponivelRepositoryPort) {
        this.horarioDisponivelRepositoryPort = horarioDisponivelRepositoryPort;
    }

    @Override
    public HorarioDisponivel criarHorarioDisponivel(HorarioDisponivel horarioDisponivel) {
        horarioDisponivel.setDiaSemana(horarioDisponivel.getDiaSemana().toLowerCase());
        return horarioDisponivelRepositoryPort.save(horarioDisponivel);
    }

    @Override
    public List<HorarioDisponivel> listarHorariosDisponiveis(Long medicoId) {
        return horarioDisponivelRepositoryPort.findByMedicoId(medicoId);
    }
}
