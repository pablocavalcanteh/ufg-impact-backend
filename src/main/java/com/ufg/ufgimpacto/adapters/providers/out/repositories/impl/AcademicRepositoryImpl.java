package com.ufg.ufgimpacto.adapters.providers.out.repositories.impl;

import com.ufg.ufgimpacto.adapters.providers.out.entities.AcademicUnitEntity;
import com.ufg.ufgimpacto.adapters.providers.out.repositories.AcademicRepository;
import com.ufg.ufgimpacto.domain.AcademicUnit;
import com.ufg.ufgimpacto.domain.ports.repository.RepositoryPort;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

@Component
public class AcademicRepositoryImpl implements RepositoryPort<AcademicUnit> {

  @Autowired
  private AcademicRepository academicRepository;
  @Autowired
  private ModelMapper modelMapper;

  @Override
  public AcademicUnit save(AcademicUnit academicUnit) {
    AcademicUnitEntity academicUnitEntity = modelMapper.map(academicUnit, AcademicUnitEntity.class);
    return modelMapper.map(academicRepository.save(academicUnitEntity), AcademicUnit.class);
  }

  @Override
  public List<AcademicUnit> findAll() {
    return academicRepository.findAll().stream()
        .map(entity -> modelMapper.map(entity, AcademicUnit.class)).collect(toList());
  }

  @Override
  public Optional<AcademicUnit> findById(Long id) {
    AcademicUnitEntity academicUnitEntity = academicRepository.findById(id).get();
    return Optional.of(modelMapper.map(academicUnitEntity, AcademicUnit.class));
  }
}
