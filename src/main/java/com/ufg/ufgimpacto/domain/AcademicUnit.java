package com.ufg.ufgimpacto.domain;

public class AcademicUnit {

  private Long id;
  private String name;
  private Integer totalVacancies;

  public AcademicUnit() {
  }

  public AcademicUnit(Long id, String name, Integer totalVacancies) {
    this.id = id;
    this.name = name;
    this.totalVacancies = totalVacancies;
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

  public Integer getTotalVacancies() {
    return totalVacancies;
  }

  public void setTotalVacancies(Integer totalVacancies) {
    this.totalVacancies = totalVacancies;
  }
}
