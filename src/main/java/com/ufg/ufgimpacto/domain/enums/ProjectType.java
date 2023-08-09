package com.ufg.ufgimpacto.domain.enums;

public enum ProjectType {

  RESEARCH("research"),
  TEACHING("teaching"),
  EXTENSION("extension");

  private String description;

  ProjectType(String description) {
    this.description = description;
  }

  public String getDescription() {
    return description;
  }

}
