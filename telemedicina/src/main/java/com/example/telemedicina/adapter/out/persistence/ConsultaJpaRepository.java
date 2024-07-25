package com.example.telemedicina.adapter.out.persistence;

import com.example.telemedicina.domain.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ConsultaJpaRepository extends JpaRepository<Consulta, UUID> {
}
