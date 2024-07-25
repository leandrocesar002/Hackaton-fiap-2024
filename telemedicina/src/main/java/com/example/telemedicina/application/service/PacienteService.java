package com.example.telemedicina.application.service;

import com.example.telemedicina.application.port.in.CreatePacienteUseCase;
import com.example.telemedicina.application.port.in.ListPacientesUseCase;
import com.example.telemedicina.application.port.out.PacienteRepositoryPort;
import com.example.telemedicina.domain.Paciente;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteService implements CreatePacienteUseCase, ListPacientesUseCase {

    private final PacienteRepositoryPort pacienteRepositoryPort;

    public PacienteService(PacienteRepositoryPort pacienteRepositoryPort) {
        this.pacienteRepositoryPort = pacienteRepositoryPort;
    }

    @Override
    public Paciente criarPaciente(Paciente paciente) {
        return pacienteRepositoryPort.save(paciente);
    }

    @Override
    public List<Paciente> listarPacientes() {
        return pacienteRepositoryPort.findAll();
    }
}
