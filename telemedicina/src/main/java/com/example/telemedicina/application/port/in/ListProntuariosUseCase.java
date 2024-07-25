package com.example.telemedicina.application.port.in;

import com.example.telemedicina.domain.Prontuario;

import java.util.List;

public interface ListProntuariosUseCase {
    List<Prontuario> listarProntuarios();
}
