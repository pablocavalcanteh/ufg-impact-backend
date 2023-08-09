package com.ufg.ufgimpacto.domain;

public class Keyword {

  private Long id;
  private String keyword;

  public Keyword() {
  }

  public Keyword(Long id, String keyword) {
    this.id = id;
    this.keyword = keyword;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }
}
