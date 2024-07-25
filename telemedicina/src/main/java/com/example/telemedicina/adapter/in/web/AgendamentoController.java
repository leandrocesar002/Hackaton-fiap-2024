package com.example.telemedicina.adapter.in.web;

import com.example.telemedicina.application.port.in.CreateAgendamentoUseCase;
import com.example.telemedicina.application.port.in.ListAgendamentosUseCase;
import com.example.telemedicina.domain.Agendamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/agendamentos")
public class AgendamentoController {

    private final CreateAgendamentoUseCase createAgendamentoUseCase;
    private final ListAgendamentosUseCase listAgendamentosUseCase;

    @Autowired
    public AgendamentoController(CreateAgendamentoUseCase createAgendamentoUseCase, ListAgendamentosUseCase listAgendamentosUseCase) {
        this.createAgendamentoUseCase = createAgendamentoUseCase;
        this.listAgendamentosUseCase = listAgendamentosUseCase;
    }

    @PostMapping
    public Agendamento criarAgendamento(@RequestBody Agendamento agendamento) {
        return createAgendamentoUseCase.criarAgendamento(agendamento);
    }

    @GetMapping
    public List<Agendamento> listarAgendamentos() {
        return listAgendamentosUseCase.listarAgendamentos();
    }
}
