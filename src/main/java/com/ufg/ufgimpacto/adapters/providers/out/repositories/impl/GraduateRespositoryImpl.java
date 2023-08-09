package com.ufg.ufgimpacto.adapters.providers.out.repositories.impl;

import com.ufg.ufgimpacto.adapters.providers.out.entities.GraduateEntity;
import com.ufg.ufgimpacto.adapters.providers.out.repositories.GraduateRepository;
import com.ufg.ufgimpacto.domain.ports.repository.RepositoryPort;
import com.ufg.ufgimpacto.domain.Graduate;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList;

public class GraduateRespositoryImpl implements RepositoryPort<Graduate> {

  @Autowired
  private GraduateRepository graduateRepository;
  @Autowired
  private ModelMapper modelMapper;

  @Override
  public Graduate save(Graduate graduate) {
    GraduateEntity graduateEntity = modelMapper.map(graduate, GraduateEntity.class);
    return modelMapper.map(graduateRepository.save(graduateEntity), Graduate.class);
  }

  @Override
  public List<Graduate> findAll() {
    return graduateRepository.findAll().stream()
        .map(entity -> modelMapper.map(entity, Graduate.class)).collect(toList());
  }

  @Override
  public Optional<Graduate> findById(Long id) {
    GraduateEntity graduateEntity = graduateRepository.findById(id).get();
    return Optional.of(modelMapper.map(graduateEntity, Graduate.class));
  }
}
