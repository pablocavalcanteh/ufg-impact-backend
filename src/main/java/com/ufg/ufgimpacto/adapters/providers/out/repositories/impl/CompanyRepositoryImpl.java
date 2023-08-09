package com.ufg.ufgimpacto.adapters.providers.out.repositories.impl;

import com.ufg.ufgimpacto.adapters.providers.out.entities.CompanyEntity;
import com.ufg.ufgimpacto.adapters.providers.out.repositories.CompanyRepository;
import com.ufg.ufgimpacto.domain.Company;
import com.ufg.ufgimpacto.domain.ports.repository.RepositoryPort;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList;

@Component
public class CompanyRepositoryImpl implements RepositoryPort<Company> {

  @Autowired
  private CompanyRepository companyRepository;
  @Autowired
  private ModelMapper modelMapper;

  @Override
  public Company save(Company company) {
    CompanyEntity companyEntity = modelMapper.map(company, CompanyEntity.class);
    return modelMapper.map(companyRepository.save(companyEntity), Company.class);
  }

  @Override
  public List<Company> findAll() {
    return companyRepository.findAll().stream()
        .map(entity -> modelMapper.map(entity, Company.class)).collect(toList());
  }

  @Override
  public Optional<Company> findById(Long id) {
    CompanyEntity companyEntity = companyRepository.findById(id).get();
    return Optional.of(modelMapper.map(companyEntity, Company.class));
  }
}
