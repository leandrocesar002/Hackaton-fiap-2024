package com.example.telemedicina.adapter.out.persistence;

import com.example.telemedicina.domain.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MedicoJpaRepository extends JpaRepository<Medico, UUID> {
    Medico findByEmail(String email);
}
