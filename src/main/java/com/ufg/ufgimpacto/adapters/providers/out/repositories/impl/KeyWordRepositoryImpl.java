package com.ufg.ufgimpacto.adapters.providers.out.repositories.impl;

import com.ufg.ufgimpacto.adapters.providers.out.entities.KeyWordEntity;
import com.ufg.ufgimpacto.adapters.providers.out.repositories.KeyWordRepository;
import com.ufg.ufgimpacto.domain.Keyword;
import com.ufg.ufgimpacto.domain.ports.repository.RepositoryPort;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList;

@Component
public class KeyWordRepositoryImpl implements RepositoryPort<Keyword> {

  @Autowired
  private KeyWordRepository keyWordRepository;
  @Autowired
  private ModelMapper modelMapper;

  @Override
  public Keyword save(Keyword keyword) {
    KeyWordEntity keyWordEntity = modelMapper.map(keyword, KeyWordEntity.class);
    return modelMapper.map(keyWordRepository.save(keyWordEntity), Keyword.class);
  }

  @Override
  public List<Keyword> findAll() {
    return keyWordRepository.findAll().stream()
        .map(entity -> modelMapper.map(entity, Keyword.class))
        .collect(toList());
  }

  @Override
  public Optional<Keyword> findById(Long id) {
    KeyWordEntity keyWordEntity = keyWordRepository.findById(id).get();
    return Optional.of(modelMapper.map(keyWordEntity, Keyword.class));

  }
}
