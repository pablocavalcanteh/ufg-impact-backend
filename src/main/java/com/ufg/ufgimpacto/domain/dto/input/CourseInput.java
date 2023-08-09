package com.ufg.ufgimpacto.domain.dto.input;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CourseInput {

  private Long id_curso;
  private String nome;
  private String grau_academico;
  private String convenio_academico;
  private String modalidade;
  private String tipo_oferta_curso;
  private Long id_unidade;
  private String unidade;
  private String sigla_unidade;
  private String municipio;
  private Long id_campus;
  private String campus;
  private String turno;

  public CourseInput() {
  }

  public CourseInput(Long id_curso, String nome, String grau_academico, String convenio_academico,
                     String modalidade, String tipo_oferta_curso, Long id_unidade, String unidade,
                     String sigla_unidade, String municipio, Long id_campus, String campus, String turno) {
    this.id_curso = id_curso;
    this.nome = nome;
    this.grau_academico = grau_academico;
    this.convenio_academico = convenio_academico;
    this.modalidade = modalidade;
    this.tipo_oferta_curso = tipo_oferta_curso;
    this.id_unidade = id_unidade;
    this.unidade = unidade;
    this.sigla_unidade = sigla_unidade;
    this.municipio = municipio;
    this.id_campus = id_campus;
    this.campus = campus;
    this.turno = turno;
  }

  public Long getId_curso() {
    return id_curso;
  }

  public void setId_curso(Long id_curso) {
    this.id_curso = id_curso;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getGrau_academico() {
    return grau_academico;
  }

  public void setGrau_academico(String grau_academico) {
    this.grau_academico = grau_academico;
  }

  public String getConvenio_academico() {
    return convenio_academico;
  }

  public void setConvenio_academico(String convenio_academico) {
    this.convenio_academico = convenio_academico;
  }

  public String getModalidade() {
    return modalidade;
  }

  public void setModalidade(String modalidade) {
    this.modalidade = modalidade;
  }

  public String getTipo_oferta_curso() {
    return tipo_oferta_curso;
  }

  public void setTipo_oferta_curso(String tipo_oferta_curso) {
    this.tipo_oferta_curso = tipo_oferta_curso;
  }

  public Long getId_unidade() {
    return id_unidade;
  }

  public void setId_unidade(Long id_unidade) {
    this.id_unidade = id_unidade;
  }

  public String getUnidade() {
    return unidade;
  }

  public void setUnidade(String unidade) {
    this.unidade = unidade;
  }

  public String getSigla_unidade() {
    return sigla_unidade;
  }

  public void setSigla_unidade(String sigla_unidade) {
    this.sigla_unidade = sigla_unidade;
  }

  public String getMunicipio() {
    return municipio;
  }

  public void setMunicipio(String municipio) {
    this.municipio = municipio;
  }

  public Long getId_campus() {
    return id_campus;
  }

  public void setId_campus(Long id_campus) {
    this.id_campus = id_campus;
  }

  public String getCampus() {
    return campus;
  }

  public void setCampus(String campus) {
    this.campus = campus;
  }

  public String getTurno() {
    return turno;
  }

  public void setTurno(String turno) {
    this.turno = turno;
  }
}
