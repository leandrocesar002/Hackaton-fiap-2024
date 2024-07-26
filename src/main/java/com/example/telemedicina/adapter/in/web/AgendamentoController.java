package com.example.telemedicina.controller;

import com.example.telemedicina.application.port.in.CreateAgendamentoUseCase;
import com.example.telemedicina.application.port.in.ListAgendamentosUseCase;
import com.example.telemedicina.application.port.in.UpdateAgendamentoStatusUseCase;
import com.example.telemedicina.domain.Agendamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/agendamentos")
public class AgendamentoController {

    @Autowired
    private CreateAgendamentoUseCase createAgendamentoUseCase;

    @Autowired
    private ListAgendamentosUseCase listAgendamentosUseCase;

    @Autowired
    private UpdateAgendamentoStatusUseCase updateAgendamentoStatusUseCase;

    @PostMapping
    public ResponseEntity<Agendamento> criarAgendamento(@RequestBody Agendamento agendamento) {
        try {
            Agendamento novoAgendamento = createAgendamentoUseCase.criarAgendamento(agendamento);
            return ResponseEntity.ok(novoAgendamento);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(null);
        }
    }

    @GetMapping("/medico/{medicoId}")
    public ResponseEntity<List<Agendamento>> listarAgendamentosPorMedico(@PathVariable Long medicoId) {
        List<Agendamento> agendamentos = listAgendamentosUseCase.listarAgendamentosPorMedico(medicoId);
        return ResponseEntity.ok(agendamentos);
    }

    @GetMapping("/paciente/{pacienteId}")
    public ResponseEntity<List<Agendamento>> listarAgendamentosPorPaciente(@PathVariable Long pacienteId) {
        List<Agendamento> agendamentos = listAgendamentosUseCase.listarAgendamentosPorPaciente(pacienteId);
        return ResponseEntity.ok(agendamentos);
    }

    @PutMapping("/{id}/aceitar")
    public ResponseEntity<Agendamento> aceitarAgendamento(@PathVariable Long id) {
        Agendamento agendamento = updateAgendamentoStatusUseCase.aceitarAgendamento(id);
        return ResponseEntity.ok(agendamento);
    }

    @PutMapping("/{id}/recusar")
    public ResponseEntity<Agendamento> recusarAgendamento(@PathVariable Long id) {
        Agendamento agendamento = updateAgendamentoStatusUseCase.recusarAgendamento(id);
        return ResponseEntity.ok(agendamento);
    }
}
