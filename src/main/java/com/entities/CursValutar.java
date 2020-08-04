package com.entities;

import javax.persistence.Entity;

@Entity
public class CursValutar {
    
  
  private Long id;
  
  private String code;
  
  private Long rate;
  
  private Double curs;

  public CursValutar() {
  }
  
  public CursValutar(Long id, String code, Long rate, Double curs) {
    super();
    this.id = id;
    this.code = code;
    this.rate = rate;
    this.curs = curs;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Long getRate() {
    return rate;
  }

  public void setRate(Long rate) {
    this.rate = rate;
  }

  public Double getCurs() {
    return curs;
  }

  public void setCurs(Double curs) {
    this.curs = curs;
  }
  
  
  
  
}
