package com.example.telemedicina.adapter.in.web;

import com.example.telemedicina.application.port.in.CreateMedicoUseCase;
import com.example.telemedicina.application.port.in.ListMedicosUseCase;
import com.example.telemedicina.domain.Medico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/medicos")
public class MedicoController {

    private final CreateMedicoUseCase createMedicoUseCase;
    private final ListMedicosUseCase listMedicosUseCase;

    @Autowired
    public MedicoController(CreateMedicoUseCase createMedicoUseCase, ListMedicosUseCase listMedicosUseCase) {
        this.createMedicoUseCase = createMedicoUseCase;
        this.listMedicosUseCase = listMedicosUseCase;
    }

    @PostMapping
    public Medico criarMedico(@RequestBody Medico medico) {
        return createMedicoUseCase.criarMedico(medico);
    }

    @GetMapping
    public List<Medico> listarMedicos() {
        return listMedicosUseCase.listarMedicos();
    }
}
