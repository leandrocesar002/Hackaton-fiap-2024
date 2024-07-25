package com.example.telemedicina.adapter.out.persistence;

import com.example.telemedicina.application.port.out.ConsultaRepositoryPort;
import com.example.telemedicina.domain.Consulta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class ConsultaRepositoryAdapter implements ConsultaRepositoryPort {

    private final ConsultaJpaRepository consultaJpaRepository;

    @Autowired
    public ConsultaRepositoryAdapter(ConsultaJpaRepository consultaJpaRepository) {
        this.consultaJpaRepository = consultaJpaRepository;
    }

    @Override
    public Consulta save(Consulta consulta) {
        return consultaJpaRepository.save(consulta);
    }

    @Override
    public List<Consulta> findAll() {
        return consultaJpaRepository.findAll();
    }

    @Override
    public Consulta findById(UUID id) {
        return consultaJpaRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(UUID id) {
        consultaJpaRepository.deleteById(id);
    }
}
