package com.ufg.ufgimpacto.domain.dto.output;

public class CourseOutput {

  private Long id;
  private String name;
  private String modality;
  private Long idAcademicUnit;
  private String academicUnitName;
  private String acronym;
  private String city;
  private Long idCampus;
  private String campus;

  public CourseOutput() {
  }

  public CourseOutput(Long id, String name, String modality, Long idAcademicUnit,
                      String academicUnitName, String acronym, String city, Long idCampus,
                      String campus) {
    this.id = id;
    this.name = name;
    this.modality = modality;
    this.idAcademicUnit = idAcademicUnit;
    this.academicUnitName = academicUnitName;
    this.acronym = acronym;
    this.city = city;
    this.idCampus = idCampus;
    this.campus = campus;
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

  public String getModality() {
    return modality;
  }

  public void setModality(String modality) {
    this.modality = modality;
  }

  public Long getIdAcademicUnit() {
    return idAcademicUnit;
  }

  public void setIdAcademicUnit(Long idAcademicUnit) {
    this.idAcademicUnit = idAcademicUnit;
  }

  public String getAcademicUnitName() {
    return academicUnitName;
  }

  public void setAcademicUnitName(String academicUnitName) {
    this.academicUnitName = academicUnitName;
  }

  public String getAcronym() {
    return acronym;
  }

  public void setAcronym(String acronym) {
    this.acronym = acronym;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Long getIdCampus() {
    return idCampus;
  }

  public void setIdCampus(Long idCampus) {
    this.idCampus = idCampus;
  }

  public String getCampus() {
    return campus;
  }

  public void setCampus(String campus) {
    this.campus = campus;
  }
}
