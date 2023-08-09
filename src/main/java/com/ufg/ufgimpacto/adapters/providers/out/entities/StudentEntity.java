package com.ufg.ufgimpacto.adapters.providers.out.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "student")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentEntity implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String course;
  private Integer yearOfEntry;
  private Integer maximumDeadlineCompletionCourse;
  private Integer yearDetachment;
  private Boolean affirmativeAction;
  private Float globalAverage;
  private Float  courseGlobalAverage;
  private String status;
  private String sex;
  private String race;

}
