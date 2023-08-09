package com.ufg.ufgimpacto.adapters.providers.out.repositories;

import com.ufg.ufgimpacto.adapters.providers.out.entities.KeyWordEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KeyWordRepository extends JpaRepository<KeyWordEntity, Long> {
}
