package com.example.telemedicina.application.service;

import com.example.telemedicina.application.port.in.CreateMedicoUseCase;
import com.example.telemedicina.application.port.in.ListMedicosUseCase;
import com.example.telemedicina.application.port.out.MedicoRepositoryPort;
import com.example.telemedicina.domain.Medico;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicoService implements CreateMedicoUseCase, ListMedicosUseCase {

    private final MedicoRepositoryPort medicoRepositoryPort;
    private final PasswordEncoder passwordEncoder;

    public MedicoService(MedicoRepositoryPort medicoRepositoryPort, PasswordEncoder passwordEncoder) {
        this.medicoRepositoryPort = medicoRepositoryPort;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public Medico criarMedico(Medico medico) {
        medico.setSenha(passwordEncoder.encode(medico.getSenha()));
        return medicoRepositoryPort.save(medico);
    }

    @Override
    public List<Medico> listarMedicos() {
        return medicoRepositoryPort.findAll();
    }
}
