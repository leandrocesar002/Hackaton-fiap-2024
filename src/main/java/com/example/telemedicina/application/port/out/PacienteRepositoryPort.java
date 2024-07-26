package com.example.telemedicina.application.port.out;

import com.example.telemedicina.domain.Paciente;

import java.util.List;
import java.util.UUID;

public interface PacienteRepositoryPort {
    Paciente save(Paciente paciente);

    List<Paciente> findAll();

    Paciente findById(UUID id);

    void deleteById(UUID id);

    Paciente findByEmail(String email);
}
