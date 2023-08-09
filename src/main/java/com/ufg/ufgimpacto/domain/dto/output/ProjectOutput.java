package com.ufg.ufgimpacto.domain.dto.output;

public class ProjectOutput {
  private Integer id;
  private String type;
  private String title;
  private String summary;
  private String academicUnitAcronym;
  private String academicUnitName;
  private Integer academicUnitId;

  public ProjectOutput() {
  }

  public ProjectOutput(Integer id, String type, String title, String summary,
                       String academicUnitAcronym, String academicUnitName,
                       Integer academicUnitId) {
    this.id = id;
    this.type = type;
    this.title = title;
    this.summary = summary;
    this.academicUnitAcronym = academicUnitAcronym;
    this.academicUnitName = academicUnitName;
    this.academicUnitId = academicUnitId;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  public String getAcademicUnitAcronym() {
    return academicUnitAcronym;
  }

  public void setAcademicUnitAcronym(String academicUnitAcronym) {
    this.academicUnitAcronym = academicUnitAcronym;
  }

  public String getAcademicUnitName() {
    return academicUnitName;
  }

  public void setAcademicUnitName(String academicUnitName) {
    this.academicUnitName = academicUnitName;
  }

  public Integer getAcademicUnitId() {
    return academicUnitId;
  }

  public void setAcademicUnitId(Integer academicUnitId) {
    this.academicUnitId = academicUnitId;
  }
}
