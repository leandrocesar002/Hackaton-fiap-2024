package com.example.telemedicina.security;

import com.example.telemedicina.domain.Medico;
import com.example.telemedicina.domain.Paciente;
import com.example.telemedicina.adapter.out.persistence.MedicoJpaRepository;
import com.example.telemedicina.adapter.out.persistence.PacienteJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private MedicoJpaRepository medicoJpaRepository;

    @Autowired
    private PacienteJpaRepository pacienteJpaRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Medico medico = medicoJpaRepository.findByEmail(username);
        if (medico != null) {
            return new org.springframework.security.core.userdetails.User(medico.getEmail(), medico.getSenha(), new ArrayList<>());
        }

        Paciente paciente = pacienteJpaRepository.findByEmail(username);
        if (paciente != null) {
            return new org.springframework.security.core.userdetails.User(paciente.getEmail(), paciente.getSenha(), new ArrayList<>());
        }

        throw new UsernameNotFoundException("Usuário não encontrado com o email: " + username);
    }
}
