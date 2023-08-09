package com.ufg.ufgimpacto.adapters.providers.out.repositories.impl;

import com.ufg.ufgimpacto.adapters.providers.out.entities.ProjectEntity;
import com.ufg.ufgimpacto.adapters.providers.out.repositories.ProjectRepository;
import com.ufg.ufgimpacto.domain.Project;
import com.ufg.ufgimpacto.domain.ports.repository.RepositoryPort;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList;

@Component
@Primary
public class ProjectRepositoryImpl implements RepositoryPort<Project> {

  @Autowired
  private ProjectRepository projectRepository;
  @Autowired
  private ModelMapper modelMapper;

  @Override
  public Project save(Project project) {
    ProjectEntity projectEntity = modelMapper.map(project, ProjectEntity.class);
    return modelMapper.map(projectRepository.save(projectEntity), Project.class);
  }

  @Override
  public List<Project> findAll() {
    return projectRepository.findAll().stream()
        .map(entity -> modelMapper.map(entity, Project.class)).collect(toList());
  }

  @Override
  public Optional<Project> findById(Long id) {
    ProjectEntity projectEntity = projectRepository.findById(id).get();
    return Optional.of(modelMapper.map(projectEntity, Project.class));
  }
}
