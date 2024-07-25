package com.example.telemedicina.adapter.out.persistence;

import com.example.telemedicina.application.port.out.MedicoRepositoryPort;
import com.example.telemedicina.domain.Medico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class MedicoRepositoryAdapter implements MedicoRepositoryPort {

    private final MedicoJpaRepository medicoJpaRepository;

    @Autowired
    public MedicoRepositoryAdapter(MedicoJpaRepository medicoJpaRepository) {
        this.medicoJpaRepository = medicoJpaRepository;
    }

    @Override
    public Medico save(Medico medico) {
        return medicoJpaRepository.save(medico);
    }

    @Override
    public List<Medico> findAll() {
        return medicoJpaRepository.findAll();
    }

    @Override
    public Medico findById(UUID id) {
        return medicoJpaRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(UUID id) {
        medicoJpaRepository.deleteById(id);
    }
    @Override
    public Medico findByEmail(String email) {
        return medicoJpaRepository.findByEmail(email);
    }
}
