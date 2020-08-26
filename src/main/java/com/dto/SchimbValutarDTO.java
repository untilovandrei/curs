package com.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class SchimbValutarDTO {

  private Long id;
  
  private String codValuta;
  
  private Double cursSchimb;
  
  private Double sumaPrimita;
  
  private String sumaEliberata;

  public SchimbValutarDTO(String codValuta, Double cursSchimb, Double sumaPrimita, String sumaEliberata) {
    this.codValuta = codValuta;
    this.cursSchimb = cursSchimb;
    this.sumaPrimita = sumaPrimita;
    this.sumaEliberata = sumaEliberata;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getCodValuta() {
    return codValuta;
  }

  public void setCodValuta(String codValuta) {
    this.codValuta = codValuta;
  }

  public Double getCursSchimb() {
    return cursSchimb;
  }

  public void setCursSchimb(Double cursSchimb) {
    this.cursSchimb = cursSchimb;
  }

  public Double getSumaPrimita() {
    return sumaPrimita;
  }

  public void setSumaPrimita(Double sumaPrimita) {
    this.sumaPrimita = sumaPrimita;
  }

  public String getSumaEliberata() {
    return sumaEliberata;
  }

  public void setSumaEliberata(String sumaEliberata) {
    this.sumaEliberata = sumaEliberata;
  }
}
