package com.ufg.ufgimpacto.domain.ports.service;

import com.ufg.ufgimpacto.domain.Student;
import com.ufg.ufgimpacto.domain.dto.output.StudentOutput;

import java.util.List;
import java.util.Map;

public interface UseCasePort {
  Map project();
  Map projectByTypeProject();
  Map course();
  Map courseByAcademicUnit();
  StudentOutput student();
}
