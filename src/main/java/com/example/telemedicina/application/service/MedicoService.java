package com.example.telemedicina.application.service;

import com.example.telemedicina.application.port.in.CreateMedicoUseCase;
import com.example.telemedicina.application.port.in.ListMedicosUseCase;
import com.example.telemedicina.application.port.out.MedicoRepositoryPort;
import com.example.telemedicina.domain.Medico;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicoService implements CreateMedicoUseCase, ListMedicosUseCase {

    private final MedicoRepositoryPort medicoRepositoryPort;

    public MedicoService(MedicoRepositoryPort medicoRepositoryPort) {
        this.medicoRepositoryPort = medicoRepositoryPort;
    }

    @Override
    public Medico criarMedico(Medico medico) {
        return medicoRepositoryPort.save(medico);
    }

    @Override
    public List<Medico> listarMedicos() {
        return medicoRepositoryPort.findAll();
    }
}
