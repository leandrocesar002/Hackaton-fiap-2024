package com.example.telemedicina.configuration;

import com.example.telemedicina.adapter.out.persistence.*;
import com.example.telemedicina.application.port.out.*;
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
