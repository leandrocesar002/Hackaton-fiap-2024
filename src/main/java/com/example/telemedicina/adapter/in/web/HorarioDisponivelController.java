package com.example.telemedicina.controller;

import com.example.telemedicina.application.port.in.CreateHorarioDisponivelUseCase;
import com.example.telemedicina.application.port.in.ListHorarioDisponivelUseCase;
import com.example.telemedicina.domain.HorarioDisponivel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/horariosdisponiveis")
public class HorarioDisponivelController {

    @Autowired
    private CreateHorarioDisponivelUseCase createHorarioDisponivelUseCase;

    @Autowired
    private ListHorarioDisponivelUseCase listHorarioDisponivelUseCase;

    @PostMapping
    @PreAuthorize("hasRole('ROLE_MEDICO')")
    public ResponseEntity<HorarioDisponivel> criarHorarioDisponivel(@RequestBody HorarioDisponivel horarioDisponivel) {
        HorarioDisponivel novoHorario = createHorarioDisponivelUseCase.criarHorarioDisponivel(horarioDisponivel);
        return ResponseEntity.ok(novoHorario);
    }

    @GetMapping("/{medicoId}")
    public ResponseEntity<List<HorarioDisponivel>> listarHorariosDisponiveis(@PathVariable Long medicoId) {
        List<HorarioDisponivel> horarios = listHorarioDisponivelUseCase.listarHorariosDisponiveis(medicoId);
        return ResponseEntity.ok(horarios);
    }
}
