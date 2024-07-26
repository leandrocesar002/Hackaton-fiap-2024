package com.example.telemedicina.domain;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
public class Agendamento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long medicoId;
    private Long pacienteId;
    private LocalDateTime dataHora;

    @Enumerated(EnumType.STRING)
    private Status status;

    private Double valor;

    public enum Status {
        AGENDADO,
        ACEITO,
        RECUSADO,
        COMPLETADO
    }
}
