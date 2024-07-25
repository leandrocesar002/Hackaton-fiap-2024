package com.example.telemedicina.application.port.out;

import com.example.telemedicina.domain.Consulta;

import java.util.List;
import java.util.UUID;

public interface ConsultaRepositoryPort {
    Consulta save(Consulta consulta);
    List<Consulta> findAll();
    Consulta findById(UUID id);
    void deleteById(UUID id);
}
