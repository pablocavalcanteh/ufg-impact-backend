package com.ufg.ufgimpacto.adapters.providers.out.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "academic_unit")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AcademicUnitEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String name;
  private Integer totalVacancies;
  @ManyToOne
  @JoinColumn(name = "campus_id")
  private CampusEntity campus;
  @OneToMany(mappedBy = "academicUnitEntity")
  private List<CourseEntity> courses = new ArrayList<>();
  @OneToMany(mappedBy = "academicUnitEntity")
  private List<ProjectEntity> projects  = new ArrayList<>();

}
