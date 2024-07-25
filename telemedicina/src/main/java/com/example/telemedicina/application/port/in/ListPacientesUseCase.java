package com.example.telemedicina.application.port.in;

import com.example.telemedicina.domain.Paciente;

import java.util.List;

public interface ListPacientesUseCase {
    List<Paciente> listarPacientes();
}
