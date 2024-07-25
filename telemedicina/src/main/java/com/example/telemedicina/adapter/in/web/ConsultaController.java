package com.example.telemedicina.adapter.in.web;

import com.example.telemedicina.application.port.in.CreateConsultaUseCase;
import com.example.telemedicina.application.port.in.ListConsultasUseCase;
import com.example.telemedicina.domain.Consulta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/consultas")
public class ConsultaController {

    private final CreateConsultaUseCase createConsultaUseCase;
    private final ListConsultasUseCase listConsultasUseCase;

    @Autowired
    public ConsultaController(CreateConsultaUseCase createConsultaUseCase, ListConsultasUseCase listConsultasUseCase) {
        this.createConsultaUseCase = createConsultaUseCase;
        this.listConsultasUseCase = listConsultasUseCase;
    }

    @PostMapping
    public Consulta criarConsulta(@RequestBody Consulta consulta) {
        return createConsultaUseCase.criarConsulta(consulta);
    }

    @GetMapping
    public List<Consulta> listarConsultas() {
        return listConsultasUseCase.listarConsultas();
    }
}
