package com.example.telemedicina.application.service;

import com.example.telemedicina.application.port.in.CreateProntuarioUseCase;
import com.example.telemedicina.application.port.in.ListProntuariosUseCase;
import com.example.telemedicina.application.port.out.ProntuarioRepositoryPort;
import com.example.telemedicina.domain.Prontuario;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProntuarioService implements CreateProntuarioUseCase, ListProntuariosUseCase {

    private final ProntuarioRepositoryPort prontuarioRepositoryPort;

    public ProntuarioService(ProntuarioRepositoryPort prontuarioRepositoryPort) {
        this.prontuarioRepositoryPort = prontuarioRepositoryPort;
    }

    @Override
    public Prontuario criarProntuario(Prontuario prontuario) {
        return prontuarioRepositoryPort.save(prontuario);
    }

    @Override
    public List<Prontuario> listarProntuarios() {
        return prontuarioRepositoryPort.findAll();
    }
}
