package com.example.telemedicina.adapter.out.persistence;

import com.example.telemedicina.application.port.out.HorarioDisponivelRepositoryPort;
import com.example.telemedicina.domain.HorarioDisponivel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HorarioDisponivelRepositoryAdapter implements HorarioDisponivelRepositoryPort {

    @Autowired
    private HorarioDisponivelJpaRepository horarioDisponivelJpaRepository;

    @Override
    public HorarioDisponivel save(HorarioDisponivel horarioDisponivel) {
        return horarioDisponivelJpaRepository.save(horarioDisponivel);
    }

    @Override
    public List<HorarioDisponivel> findByMedicoId(Long medicoId) {
        return horarioDisponivelJpaRepository.findByMedicoId(medicoId);
    }

    @Override
    public List<HorarioDisponivel> findByMedicoIdAndDiaSemana(Long medicoId, String diaSemana) {
        return horarioDisponivelJpaRepository.findByMedicoIdAndDiaSemana(medicoId, diaSemana);
    }
}
