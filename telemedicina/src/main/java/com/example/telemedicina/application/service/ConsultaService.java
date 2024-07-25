package com.example.telemedicina.application.service;

import com.example.telemedicina.application.port.in.CreateConsultaUseCase;
import com.example.telemedicina.application.port.in.ListConsultasUseCase;
import com.example.telemedicina.application.port.out.ConsultaRepositoryPort;
import com.example.telemedicina.domain.Consulta;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultaService implements CreateConsultaUseCase, ListConsultasUseCase {

    private final ConsultaRepositoryPort consultaRepositoryPort;

    public ConsultaService(ConsultaRepositoryPort consultaRepositoryPort) {
        this.consultaRepositoryPort = consultaRepositoryPort;
    }

    @Override
    public Consulta criarConsulta(Consulta consulta) {
        return consultaRepositoryPort.save(consulta);
    }

    @Override
    public List<Consulta> listarConsultas() {
        return consultaRepositoryPort.findAll();
    }
}
