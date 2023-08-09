package com.ufg.ufgimpacto.adapters.providers.out.repositories;

import com.ufg.ufgimpacto.adapters.providers.out.entities.GraduateEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GraduateRepository extends JpaRepository<GraduateEntity, Long> {
}
