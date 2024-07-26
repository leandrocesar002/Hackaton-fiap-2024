package com.example.telemedicina.adapter.out.persistence;

import com.example.telemedicina.domain.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AgendamentoJpaRepository extends JpaRepository<Agendamento, Long> {
    List<Agendamento> findByMedicoId(Long medicoId);

    List<Agendamento> findByPacienteId(Long pacienteId);

    Optional<Agendamento> findById(Long id);
}
