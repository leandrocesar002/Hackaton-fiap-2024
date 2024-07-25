package com.example.telemedicina.application.port.out;

import com.example.telemedicina.domain.Prontuario;

import java.util.List;
import java.util.UUID;

public interface ProntuarioRepositoryPort {
    Prontuario save(Prontuario prontuario);
    List<Prontuario> findAll();
    Prontuario findById(UUID id);
    void deleteById(UUID id);
}
