package com.example.telemedicina.adapter.out.persistence;

import com.example.telemedicina.application.port.out.ProntuarioRepositoryPort;
import com.example.telemedicina.domain.Prontuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class ProntuarioRepositoryAdapter implements ProntuarioRepositoryPort {

    private final ProntuarioJpaRepository prontuarioJpaRepository;

    @Autowired
    public ProntuarioRepositoryAdapter(ProntuarioJpaRepository prontuarioJpaRepository) {
        this.prontuarioJpaRepository = prontuarioJpaRepository;
    }

    @Override
    public Prontuario save(Prontuario prontuario) {
        return prontuarioJpaRepository.save(prontuario);
    }

    @Override
    public List<Prontuario> findAll() {
        return prontuarioJpaRepository.findAll();
    }

    @Override
    public Prontuario findById(UUID id) {
        return prontuarioJpaRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(UUID id) {
        prontuarioJpaRepository.deleteById(id);
    }
}
