package com.ufg.ufgimpacto.adapters.providers.out.entities;

import com.ufg.ufgimpacto.domain.enums.ProjectType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "project")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProjectEntity implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  @Enumerated
  private ProjectType type;
  private String description;
  @ManyToOne
  @JoinColumn(name = "academic_unit_id")
  private AcademicUnitEntity academicUnitEntity;
  @ManyToMany
  @JoinTable(name = "project_keyword",
      joinColumns = @JoinColumn(name = "project_id"),
  inverseJoinColumns = @JoinColumn(name = "keyword_id"))
  private List<KeyWordEntity> keywords = new ArrayList<>();

}
