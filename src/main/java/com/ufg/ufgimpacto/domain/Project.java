package com.ufg.ufgimpacto.domain;

import com.ufg.ufgimpacto.domain.enums.ProjectType;

public class Project {

  private Long id;
  private ProjectType type;
  private String description;
  private String title;
  private Long idUnity;
  private String unitAbbreviation;
  private String unitName;
  private String coordination;
  private String resume;

  public Project() {
  }

  public Project(Long id, ProjectType type, String description, String title,
                 Long idUnity, String unitAbbreviation, String unitName, String coordination,
                 String resume) {
    this.id = id;
    this.type = type;
    this.description = description;
    this.title = title;
    this.idUnity = idUnity;
    this.unitAbbreviation = unitAbbreviation;
    this.unitName = unitName;
    this.coordination = coordination;
    this.resume = resume;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ProjectType getType() {
    return type;
  }

  public void setType(ProjectType type) {
    this.type = type;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Long getIdUnity() {
    return idUnity;
  }

  public void setIdUnity(Long idUnity) {
    this.idUnity = idUnity;
  }

  public String getUnitAbbreviation() {
    return unitAbbreviation;
  }

  public void setUnitAbbreviation(String unitAbbreviation) {
    this.unitAbbreviation = unitAbbreviation;
  }

  public String getUnitName() {
    return unitName;
  }

  public void setUnitName(String unitName) {
    this.unitName = unitName;
  }

  public String getCoordination() {
    return coordination;
  }

  public void setCoordination(String coordination) {
    this.coordination = coordination;
  }

  public String getResume() {
    return resume;
  }

  public void setResume(String resume) {
    this.resume = resume;
  }
}
