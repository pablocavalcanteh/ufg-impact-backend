package com.ufg.ufgimpacto.domain.dto.output;

import com.ufg.ufgimpacto.domain.Student;

import java.util.List;
import java.util.Map;

public class StudentOutput {

  private Long totalStudents;
  private Long totalGraduateStudents;
  private Long maleGraduateStudents;
  private Long femaleGraduateStudents;
  private Long totalBlackRaceBrown;
  private Long totalWhite;
  private Long totalRaceUnknown; // Não informado ou não quis declarar...
  private Long totalAffirmativeAction;
  private Map<Integer, Long> mapGraduateStudentsByYear;

  public StudentOutput() {
  }

  public StudentOutput(Long totalStudents, Long totalGraduateStudents, Long maleGraduateStudents,
                       Long femaleGraduateStudents, Long totalBlackRaceBrown, Long totalWhite,
                       Long totalRaceUnknown, Long totalAffirmativeAction, Map<Integer, Long> mapGraduateStudentsByYear) {
    this.totalStudents = totalStudents;
    this.totalGraduateStudents = totalGraduateStudents;
    this.maleGraduateStudents = maleGraduateStudents;
    this.femaleGraduateStudents = femaleGraduateStudents;
    this.totalBlackRaceBrown = totalBlackRaceBrown;
    this.totalWhite = totalWhite;
    this.totalRaceUnknown = totalRaceUnknown;
    this.totalAffirmativeAction = totalAffirmativeAction;
    this.mapGraduateStudentsByYear = mapGraduateStudentsByYear;
  }

  public Long getTotalStudents() {
    return totalStudents;
  }

  public void setTotalStudents(Long totalStudents) {
    this.totalStudents = totalStudents;
  }

  public Long getTotalGraduateStudents() {
    return totalGraduateStudents;
  }

  public void setTotalGraduateStudents(Long totalGraduateStudents) {
    this.totalGraduateStudents = totalGraduateStudents;
  }

  public Long getMaleGraduateStudents() {
    return maleGraduateStudents;
  }

  public void setMaleGraduateStudents(Long maleGraduateStudents) {
    this.maleGraduateStudents = maleGraduateStudents;
  }

  public Long getFemaleGraduateStudents() {
    return femaleGraduateStudents;
  }

  public void setFemaleGraduateStudents(Long femaleGraduateStudents) {
    this.femaleGraduateStudents = femaleGraduateStudents;
  }

  public Long getTotalBlackRaceBrown() {
    return totalBlackRaceBrown;
  }

  public void setTotalBlackRaceBrown(Long totalBlackRaceBrown) {
    this.totalBlackRaceBrown = totalBlackRaceBrown;
  }

  public Long getTotalWhite() {
    return totalWhite;
  }

  public void setTotalWhite(Long totalWhite) {
    this.totalWhite = totalWhite;
  }

  public Long getTotalRaceUnknown() {
    return totalRaceUnknown;
  }

  public void setTotalRaceUnknown(Long totalRaceUnknown) {
    this.totalRaceUnknown = totalRaceUnknown;
  }

  public Long getTotalAffirmativeAction() {
    return totalAffirmativeAction;
  }

  public void setTotalAffirmativeAction(Long totalAffirmativeAction) {
    this.totalAffirmativeAction = totalAffirmativeAction;
  }

  public Map<Integer, Long> getMapGraduateStudentsByYear() {
    return mapGraduateStudentsByYear;
  }

  public void setMapGraduateStudentsByYear(Map<Integer, Long> mapGraduateStudentsByYear) {
    this.mapGraduateStudentsByYear = mapGraduateStudentsByYear;
  }
}
