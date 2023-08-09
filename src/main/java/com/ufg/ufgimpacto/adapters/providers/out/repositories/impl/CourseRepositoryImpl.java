package com.ufg.ufgimpacto.adapters.providers.out.repositories.impl;

import com.ufg.ufgimpacto.adapters.providers.out.entities.CourseEntity;
import com.ufg.ufgimpacto.adapters.providers.out.repositories.CourseRepository;
import com.ufg.ufgimpacto.domain.Course;
import com.ufg.ufgimpacto.domain.ports.repository.RepositoryPort;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList;

public class CourseRepositoryImpl implements RepositoryPort<Course> {

  @Autowired
  private CourseRepository courseRepository;
  @Autowired
  private ModelMapper modelMapper;

  @Override
  public Course save(Course course) {
    CourseEntity courseEntity = modelMapper.map(course, CourseEntity.class);
    return modelMapper.map(courseRepository.save(courseEntity), Course.class);
  }

  @Override
  public List<Course> findAll() {
    return courseRepository.findAll().stream()
        .map(entity -> modelMapper.map(entity, Course.class)).collect(toList());
  }

  @Override
  public Optional<Course> findById(Long id) {
    CourseEntity courseEntity = courseRepository.findById(id).get();
    return Optional.of(modelMapper.map(courseEntity, Course.class));
  }
}
