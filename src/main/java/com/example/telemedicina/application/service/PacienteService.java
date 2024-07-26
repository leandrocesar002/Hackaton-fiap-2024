package com.example.telemedicina.application.service;

import com.example.telemedicina.application.port.in.CreatePacienteUseCase;
import com.example.telemedicina.application.port.in.ListPacientesUseCase;
import com.example.telemedicina.application.port.out.PacienteRepositoryPort;
import com.example.telemedicina.domain.Paciente;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteService implements CreatePacienteUseCase, ListPacientesUseCase {

    private final PacienteRepositoryPort pacienteRepositoryPort;
    private final PasswordEncoder passwordEncoder;

    public PacienteService(PacienteRepositoryPort pacienteRepositoryPort, PasswordEncoder passwordEncoder) {
        this.pacienteRepositoryPort = pacienteRepositoryPort;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public Paciente criarPaciente(Paciente paciente) {
        paciente.setSenha(passwordEncoder.encode(paciente.getSenha()));
        return pacienteRepositoryPort.save(paciente);
    }

    @Override
    public List<Paciente> listarPacientes() {
        return pacienteRepositoryPort.findAll();
    }
}
