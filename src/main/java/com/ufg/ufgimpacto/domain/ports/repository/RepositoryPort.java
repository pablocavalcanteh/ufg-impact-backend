package com.ufg.ufgimpacto.domain.ports.repository;

import java.util.List;
import java.util.Optional;

public interface RepositoryPort<T> {

  T save(T entity);
  List<T> findAll();
  Optional<T> findById(Long id);

}
