package com.example.telemedicina.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalTime;

@Entity
@Data
public class HorarioDisponivel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long medicoId;
    private String diaSemana;
    private LocalTime horaInicio;
    private LocalTime horaFim;
}
