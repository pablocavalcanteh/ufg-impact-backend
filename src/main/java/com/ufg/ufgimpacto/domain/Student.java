package com.ufg.ufgimpacto.domain;

public class Student {

  private String course;
  private Integer yearOfEntry;
  private Integer maximumDeadlineCompletionCourse;
  private Integer yearDetachment;
  private String affirmativeAction;
  private Float globalAverage;
  private Float  courseGlobalAverage;
  private String status;
  private String sex;
  private String race;
  private String cityName;

  public Student() {
  }

  public Student(String course, Integer yearOfEntry, Integer maximumDeadlineCompletionCourse,
                 Integer yearDetachment, String affirmativeAction, Float globalAverage,
                 Float courseGlobalAverage, String status, String sex,
                 String race, String cityName) {
    this.course = course;
    this.yearOfEntry = yearOfEntry;
    this.maximumDeadlineCompletionCourse = maximumDeadlineCompletionCourse;
    this.yearDetachment = yearDetachment;
    this.affirmativeAction = affirmativeAction;
    this.globalAverage = globalAverage;
    this.courseGlobalAverage = courseGlobalAverage;
    this.status = status;
    this.sex = sex;
    this.race = race;
    this.cityName = cityName;
  }

  public String getCourse() {
    return course;
  }

  public void setCourse(String course) {
    this.course = course;
  }

  public Integer getYearOfEntry() {
    return yearOfEntry;
  }

  public void setYearOfEntry(Integer yearOfEntry) {
    this.yearOfEntry = yearOfEntry;
  }

  public Integer getMaximumDeadlineCompletionCourse() {
    return maximumDeadlineCompletionCourse;
  }

  public void setMaximumDeadlineCompletionCourse(Integer maximumDeadlineCompletionCourse) {
    this.maximumDeadlineCompletionCourse = maximumDeadlineCompletionCourse;
  }

  public Integer getYearDetachment() {
    return yearDetachment;
  }

  public void setYearDetachment(Integer yearDetachment) {
    this.yearDetachment = yearDetachment;
  }

  public String getAffirmativeAction() {
    return affirmativeAction;
  }

  public void setAffirmativeAction(String affirmativeAction) {
    this.affirmativeAction = affirmativeAction;
  }

  public Float getGlobalAverage() {
    return globalAverage;
  }

  public void setGlobalAverage(Float globalAverage) {
    this.globalAverage = globalAverage;
  }

  public Float getCourseGlobalAverage() {
    return courseGlobalAverage;
  }

  public void setCourseGlobalAverage(Float courseGlobalAverage) {
    this.courseGlobalAverage = courseGlobalAverage;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public String getRace() {
    return race;
  }

  public void setRace(String race) {
    this.race = race;
  }

  public String getCityName() {
    return cityName;
  }

  public void setCityName(String cityName) {
    this.cityName = cityName;
  }
}
