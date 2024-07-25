package com.example.telemedicina.application.port.in;

import com.example.telemedicina.domain.Paciente;

public interface CreatePacienteUseCase {
    Paciente criarPaciente(Paciente paciente);
}
