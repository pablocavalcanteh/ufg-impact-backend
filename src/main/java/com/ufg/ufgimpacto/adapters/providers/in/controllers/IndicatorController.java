package com.ufg.ufgimpacto.adapters.providers.in.controllers;

import com.ufg.ufgimpacto.domain.dto.output.CourseOutput;
import com.ufg.ufgimpacto.domain.dto.output.ProjectOutput;
import com.ufg.ufgimpacto.domain.ports.service.UseCasePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

//@CrossOrigin(origins = "https://ufgimpacto.herokuapp.com/")
@Controller
@RequestMapping(value = "/api/indicator")
public class IndicatorController {

  @Autowired
  private UseCasePort useCase;

  @GetMapping(value = "/project")
  public ResponseEntity readProjects() {
    Map<String, List<ProjectOutput>> mapList = useCase.project();
    return ResponseEntity.ok().body(mapList);
  }

  @GetMapping(value = "/project-type")
  public ResponseEntity readByTypeProject() {
    Map<String, List<ProjectOutput>> mapList = useCase.projectByTypeProject();
    return ResponseEntity.ok().body(mapList);
  }

  @GetMapping(value = "/course-campus")
  public ResponseEntity readCoursesByCampus() {
    Map<String, List<CourseOutput>> mapList = useCase.course();
    return ResponseEntity.ok().body(mapList);
  }

  @GetMapping(value = "/courses-campus")
  public ResponseEntity readAllCoursesByCampus() {
    Map<String, List<CourseOutput>> mapList = useCase.course();
    return ResponseEntity.ok().body(mapList);
  }

  @GetMapping(value = "/course-academic-unit")
  public ResponseEntity readCoursesByAcademicUnit() {
    Map<String, List<CourseOutput>> mapList = useCase.courseByAcademicUnit();
    return ResponseEntity.ok().body(mapList);
  }

  @GetMapping(value = "/students-data")
  public ResponseEntity studentDataSpreadsheet() {
    var studentData = useCase.student();
    return ResponseEntity.ok().body(studentData);
  }

}
