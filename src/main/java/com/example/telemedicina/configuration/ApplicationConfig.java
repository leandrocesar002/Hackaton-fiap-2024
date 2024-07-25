package com.example.telemedicina.configuration;

import com.example.telemedicina.application.port.out.MedicoRepositoryPort;
import com.example.telemedicina.application.port.out.PacienteRepositoryPort;
import com.example.telemedicina.application.port.out.AgendamentoRepositoryPort;
import com.example.telemedicina.application.port.out.ConsultaRepositoryPort;
import com.example.telemedicina.application.port.out.ProntuarioRepositoryPort;
import com.example.telemedicina.adapter.out.persistence.MedicoRepositoryAdapter;
import com.example.telemedicina.adapter.out.persistence.PacienteRepositoryAdapter;
import com.example.telemedicina.adapter.out.persistence.AgendamentoRepositoryAdapter;
import com.example.telemedicina.adapter.out.persistence.ConsultaRepositoryAdapter;
import com.example.telemedicina.adapter.out.persistence.ProntuarioRepositoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public MedicoRepositoryPort medicoRepositoryPort(MedicoRepositoryAdapter medicoRepositoryAdapter) {
        return medicoRepositoryAdapter;
    }

    @Bean
    public PacienteRepositoryPort pacienteRepositoryPort(PacienteRepositoryAdapter pacienteRepositoryAdapter) {
        return pacienteRepositoryAdapter;
    }

    @Bean
    public AgendamentoRepositoryPort agendamentoRepositoryPort(AgendamentoRepositoryAdapter agendamentoRepositoryAdapter) {
        return agendamentoRepositoryAdapter;
    }

    @Bean
    public ConsultaRepositoryPort consultaRepositoryPort(ConsultaRepositoryAdapter consultaRepositoryAdapter) {
        return consultaRepositoryAdapter;
    }

    @Bean
    public ProntuarioRepositoryPort prontuarioRepositoryPort(ProntuarioRepositoryAdapter prontuarioRepositoryAdapter) {
        return prontuarioRepositoryAdapter;
    }
}
