package com.ufg.ufgimpacto.domain;

public class Campus {

  private Long id;
  private String name;
  private Integer totalOfGraduates;

  public Campus() {
  }

  public Campus(Long id, String name, Integer totalOfGraduates) {
    this.id = id;
    this.name = name;
    this.totalOfGraduates = totalOfGraduates;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getTotalOfGraduates() {
    return totalOfGraduates;
  }

  public void setTotalOfGraduates(Integer totalOfGraduates) {
    this.totalOfGraduates = totalOfGraduates;
  }
}
