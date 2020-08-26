package com.entities;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "schimb_valutar")
public class SchimbValutar {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  private String codValuta;
  
  private Double cursSchimb;
  
  private Double sumaPrimita;
  
  private Double sumaEliberata;
  
  private Date data;

  public SchimbValutar(String codValuta, Double cursSchimb, Double sumaPrimita, Double sumaEliberata, Date data) {
    super();
    this.codValuta = codValuta;
    this.cursSchimb = cursSchimb;
    this.sumaPrimita = sumaPrimita;
    this.sumaEliberata = sumaEliberata;
    this.data = data;
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

  public Double getSumaEliberata() {
    return sumaEliberata;
  }

  public void setSumaEliberata(Double sumaEliberata) {
    this.sumaEliberata = sumaEliberata;
  }

  public Date getData() {
    return data;
  }

  public void setData(Date data) {
    this.data = data;
  }

}
