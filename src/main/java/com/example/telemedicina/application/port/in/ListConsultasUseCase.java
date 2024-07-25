package com.example.telemedicina.application.port.in;

import com.example.telemedicina.domain.Consulta;

import java.util.List;

public interface ListConsultasUseCase {
    List<Consulta> listarConsultas();
}
