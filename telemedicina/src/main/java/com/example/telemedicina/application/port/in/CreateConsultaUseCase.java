package com.example.telemedicina.application.port.in;

import com.example.telemedicina.domain.Consulta;

public interface CreateConsultaUseCase {
    Consulta criarConsulta(Consulta consulta);
}
