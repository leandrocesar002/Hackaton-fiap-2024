package com.example.telemedicina.adapter.out.persistence;

import com.example.telemedicina.domain.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PacienteJpaRepository extends JpaRepository<Paciente, UUID> {
    Paciente findByEmail(String email);
}
