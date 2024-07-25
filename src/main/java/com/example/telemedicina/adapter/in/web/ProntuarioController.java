package com.example.telemedicina.adapter.in.web;

import com.example.telemedicina.application.port.in.CreateProntuarioUseCase;
import com.example.telemedicina.application.port.in.ListProntuariosUseCase;
import com.example.telemedicina.domain.Prontuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/prontuarios")
public class ProntuarioController {

    private final CreateProntuarioUseCase createProntuarioUseCase;
    private final ListProntuariosUseCase listProntuariosUseCase;

    @Autowired
    public ProntuarioController(CreateProntuarioUseCase createProntuarioUseCase, ListProntuariosUseCase listProntuariosUseCase) {
        this.createProntuarioUseCase = createProntuarioUseCase;
        this.listProntuariosUseCase = listProntuariosUseCase;
    }

    @PostMapping
    public Prontuario criarProntuario(@RequestBody Prontuario prontuario) {
        return createProntuarioUseCase.criarProntuario(prontuario);
    }

    @GetMapping
    public List<Prontuario> listarProntuarios() {
        return listProntuariosUseCase.listarProntuarios();
    }
}
