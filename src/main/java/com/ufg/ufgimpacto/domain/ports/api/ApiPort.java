package com.ufg.ufgimpacto.domain.ports.api;

import com.ufg.ufgimpacto.domain.dto.input.CourseInput;
import com.ufg.ufgimpacto.domain.dto.input.ProjectInput;
import com.ufg.ufgimpacto.domain.dto.input.ScheduleInput;
import com.ufg.ufgimpacto.domain.dto.input.TeamInput;

import java.util.List;

public interface ApiPort {
  List<ProjectInput> project();
  List<CourseInput> course();
  List<TeamInput> team();
  List<ScheduleInput> schedule();
}
