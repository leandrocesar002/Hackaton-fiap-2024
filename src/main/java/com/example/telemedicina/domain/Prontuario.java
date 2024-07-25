package com.example.telemedicina.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Prontuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne
    private Paciente paciente;

    @ManyToOne
    private Medico medico;

    private String descricao;
    private String arquivo;
    private LocalDateTime criadoEm;
    private LocalDateTime atualizadoEm;
}
