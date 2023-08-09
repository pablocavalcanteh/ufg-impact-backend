package com.ufg.ufgimpacto.domain.dto.input;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TeamInput {

  private Long id_turma;
  private String codigo_turma;
  private Integer ano;
  private Integer periodo;
  private Long id_curso_responsavel_oferta;
  private Long id_componente_curricular;
  private String codigo_componente_curricular;
  private String nome_componente_curricular;
  private String nivel;
  private Integer tipo;
  private String tipo_turma;
  private String situacao_turma;
  private String horario;
  private String local;
  private Integer capacidade_aluno;
  private Integer total_matriculados;
  private Integer qtd_docentes;

  public TeamInput() {
  }

  public TeamInput(Long id_turma, String codigo_turma, Integer ano, Integer periodo, Long id_curso_responsavel_oferta,
                   Long id_componente_curricular, String codigo_componente_curricular, String nome_componente_curricular,
                   String nivel, Integer tipo, String tipo_turma, String situacao_turma, String horario, String local,
                   Integer capacidade_aluno, Integer total_matriculados, Integer qtd_docentes) {
    this.id_turma = id_turma;
    this.codigo_turma = codigo_turma;
    this.ano = ano;
    this.periodo = periodo;
    this.id_curso_responsavel_oferta = id_curso_responsavel_oferta;
    this.id_componente_curricular = id_componente_curricular;
    this.codigo_componente_curricular = codigo_componente_curricular;
    this.nome_componente_curricular = nome_componente_curricular;
    this.nivel = nivel;
    this.tipo = tipo;
    this.tipo_turma = tipo_turma;
    this.situacao_turma = situacao_turma;
    this.horario = horario;
    this.local = local;
    this.capacidade_aluno = capacidade_aluno;
    this.total_matriculados = total_matriculados;
    this.qtd_docentes = qtd_docentes;
  }

  public Long getId_turma() {
    return id_turma;
  }

  public void setId_turma(Long id_turma) {
    this.id_turma = id_turma;
  }

  public String getCodigo_turma() {
    return codigo_turma;
  }

  public void setCodigo_turma(String codigo_turma) {
    this.codigo_turma = codigo_turma;
  }

  public Integer getAno() {
    return ano;
  }

  public void setAno(Integer ano) {
    this.ano = ano;
  }

  public Integer getPeriodo() {
    return periodo;
  }

  public void setPeriodo(Integer periodo) {
    this.periodo = periodo;
  }

  public Long getId_curso_responsavel_oferta() {
    return id_curso_responsavel_oferta;
  }

  public void setId_curso_responsavel_oferta(Long id_curso_responsavel_oferta) {
    this.id_curso_responsavel_oferta = id_curso_responsavel_oferta;
  }

  public Long getId_componente_curricular() {
    return id_componente_curricular;
  }

  public void setId_componente_curricular(Long id_componente_curricular) {
    this.id_componente_curricular = id_componente_curricular;
  }

  public String getCodigo_componente_curricular() {
    return codigo_componente_curricular;
  }

  public void setCodigo_componente_curricular(String codigo_componente_curricular) {
    this.codigo_componente_curricular = codigo_componente_curricular;
  }

  public String getNome_componente_curricular() {
    return nome_componente_curricular;
  }

  public void setNome_componente_curricular(String nome_componente_curricular) {
    this.nome_componente_curricular = nome_componente_curricular;
  }

  public String getNivel() {
    return nivel;
  }

  public void setNivel(String nivel) {
    this.nivel = nivel;
  }

  public Integer getTipo() {
    return tipo;
  }

  public void setTipo(Integer tipo) {
    this.tipo = tipo;
  }

  public String getTipo_turma() {
    return tipo_turma;
  }

  public void setTipo_turma(String tipo_turma) {
    this.tipo_turma = tipo_turma;
  }

  public String getSituacao_turma() {
    return situacao_turma;
  }

  public void setSituacao_turma(String situacao_turma) {
    this.situacao_turma = situacao_turma;
  }

  public String getHorario() {
    return horario;
  }

  public void setHorario(String horario) {
    this.horario = horario;
  }

  public String getLocal() {
    return local;
  }

  public void setLocal(String local) {
    this.local = local;
  }

  public Integer getCapacidade_aluno() {
    return capacidade_aluno;
  }

  public void setCapacidade_aluno(Integer capacidade_aluno) {
    this.capacidade_aluno = capacidade_aluno;
  }

  public Integer getTotal_matriculados() {
    return total_matriculados;
  }

  public void setTotal_matriculados(Integer total_matriculados) {
    this.total_matriculados = total_matriculados;
  }

  public Integer getQtd_docentes() {
    return qtd_docentes;
  }

  public void setQtd_docentes(Integer qtd_docentes) {
    this.qtd_docentes = qtd_docentes;
  }
}
