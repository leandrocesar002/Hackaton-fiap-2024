package com.example.telemedicina.adapter.in.web;

import com.example.telemedicina.application.port.in.CreatePacienteUseCase;
import com.example.telemedicina.application.port.in.ListPacientesUseCase;
import com.example.telemedicina.domain.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pacientes")
public class PacienteController {

    private final CreatePacienteUseCase createPacienteUseCase;
    private final ListPacientesUseCase listPacientesUseCase;

    @Autowired
    public PacienteController(CreatePacienteUseCase createPacienteUseCase, ListPacientesUseCase listPacientesUseCase) {
        this.createPacienteUseCase = createPacienteUseCase;
        this.listPacientesUseCase = listPacientesUseCase;
    }

    @PostMapping
    public Paciente criarPaciente(@RequestBody Paciente paciente) {
        return createPacienteUseCase.criarPaciente(paciente);
    }

    @GetMapping
    public List<Paciente> listarPacientes() {
        return listPacientesUseCase.listarPacientes();
    }
}
