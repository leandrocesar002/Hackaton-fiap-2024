package com.example.telemedicina.adapter.out.persistence;

import com.example.telemedicina.domain.HorarioDisponivel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HorarioDisponivelJpaRepository extends JpaRepository<HorarioDisponivel, Long> {
    List<HorarioDisponivel> findByMedicoId(Long medicoId);

    List<HorarioDisponivel> findByMedicoIdAndDiaSemana(Long medicoId, String diaSemana);
}
