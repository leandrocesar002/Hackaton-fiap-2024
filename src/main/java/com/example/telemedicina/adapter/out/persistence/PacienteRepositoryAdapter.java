package com.example.telemedicina.adapter.out.persistence;

import com.example.telemedicina.application.port.out.PacienteRepositoryPort;
import com.example.telemedicina.domain.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class PacienteRepositoryAdapter implements PacienteRepositoryPort {

    private final PacienteJpaRepository pacienteJpaRepository;

    @Autowired
    public PacienteRepositoryAdapter(PacienteJpaRepository pacienteJpaRepository) {
        this.pacienteJpaRepository = pacienteJpaRepository;
    }

    @Override
    public Paciente save(Paciente paciente) {
        return pacienteJpaRepository.save(paciente);
    }

    @Override
    public List<Paciente> findAll() {
        return pacienteJpaRepository.findAll();
    }

    @Override
    public Paciente findById(UUID id) {
        return pacienteJpaRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(UUID id) {
        pacienteJpaRepository.deleteById(id);
    }

    @Override
    public Paciente findByEmail(String email) {
        return pacienteJpaRepository.findByEmail(email);
    }
}
