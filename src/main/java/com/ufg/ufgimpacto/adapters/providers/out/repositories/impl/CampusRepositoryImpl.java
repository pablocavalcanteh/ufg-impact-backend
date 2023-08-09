package com.ufg.ufgimpacto.adapters.providers.out.repositories.impl;

import com.ufg.ufgimpacto.adapters.providers.out.entities.CampusEntity;
import com.ufg.ufgimpacto.adapters.providers.out.repositories.CampusRepository;
import com.ufg.ufgimpacto.domain.Campus;
import com.ufg.ufgimpacto.domain.ports.repository.RepositoryPort;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList;

@Component
public class CampusRepositoryImpl implements RepositoryPort<Campus> {

  @Autowired
  private CampusRepository campusRepository;
  @Autowired
  private ModelMapper modelMapper;

  @Override
  public Campus save(Campus campus) {
    CampusEntity campusEntity = modelMapper.map(campus, CampusEntity.class);
    return modelMapper.map(campusRepository.save(campusEntity), Campus.class);
  }

  @Override
  public List<Campus> findAll() {
    return campusRepository.findAll().stream()
        .map(entity -> modelMapper.map(entity, Campus.class)).collect(toList());
  }

  @Override
  public Optional<Campus> findById(Long id) {
    CampusEntity campusEntity = campusRepository.findById(id).get();
    return Optional.of(modelMapper.map(campusEntity, Campus.class));
  }
}
