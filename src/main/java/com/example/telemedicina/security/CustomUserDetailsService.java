package com.example.telemedicina.security;

import com.example.telemedicina.adapter.out.persistence.MedicoJpaRepository;
import com.example.telemedicina.adapter.out.persistence.PacienteJpaRepository;
import com.example.telemedicina.domain.Medico;
import com.example.telemedicina.domain.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private MedicoJpaRepository medicoJpaRepository;

    @Autowired
    private PacienteJpaRepository pacienteJpaRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Medico medico = medicoJpaRepository.findByEmail(email);
        if (medico != null) {
            return new org.springframework.security.core.userdetails.User(
                    medico.getEmail(),
                    medico.getSenha(),
                    Collections.singletonList(new SimpleGrantedAuthority("ROLE_MEDICO"))
            );
        }

        Paciente paciente = pacienteJpaRepository.findByEmail(email);
        if (paciente != null) {
            return new org.springframework.security.core.userdetails.User(
                    paciente.getEmail(),
                    paciente.getSenha(),
                    Collections.singletonList(new SimpleGrantedAuthority("ROLE_PACIENTE"))
            );
        }

        throw new UsernameNotFoundException("Usuário não encontrado com o email: " + email);
    }
}
