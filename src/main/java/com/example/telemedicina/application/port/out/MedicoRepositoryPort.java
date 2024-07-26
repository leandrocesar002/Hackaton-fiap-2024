package com.example.telemedicina.application.port.out;

import com.example.telemedicina.domain.Medico;

import java.util.List;
import java.util.UUID;

public interface MedicoRepositoryPort {
    Medico save(Medico medico);

    List<Medico> findAll();

    Medico findById(UUID id);

    void deleteById(UUID id);

    Medico findByEmail(String email);
}
