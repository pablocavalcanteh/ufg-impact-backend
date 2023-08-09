package com.ufg.ufgimpacto.adapters.providers.out.repositories;

import com.ufg.ufgimpacto.adapters.providers.out.entities.CompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<CompanyEntity, Long> {
}
