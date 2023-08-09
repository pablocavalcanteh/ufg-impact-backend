package com.ufg.ufgimpacto.domain;

public class Company {

  private Long id;
  private String name;
  private String cnpj;
  private Double annualBilling;
  private Integer numberOfEmployees;

  public Company() {
  }

  public Company(Long id, String name, String cnpj, Double annualBilling, Integer numberOfEmployees) {
    this.id = id;
    this.name = name;
    this.cnpj = cnpj;
    this.annualBilling = annualBilling;
    this.numberOfEmployees = numberOfEmployees;
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

  public String getCnpj() {
    return cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  public Double getAnnualBilling() {
    return annualBilling;
  }

  public void setAnnualBilling(Double annualBilling) {
    this.annualBilling = annualBilling;
  }

  public Integer getNumberOfEmployees() {
    return numberOfEmployees;
  }

  public void setNumberOfEmployees(Integer numberOfEmployees) {
    this.numberOfEmployees = numberOfEmployees;
  }
}
