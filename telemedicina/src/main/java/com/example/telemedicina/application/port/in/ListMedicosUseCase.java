package com.example.telemedicina.application.port.in;

import com.example.telemedicina.domain.Medico;

import java.util.List;

public interface ListMedicosUseCase {
    List<Medico> listarMedicos();
}
