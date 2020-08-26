package com.dto;

import java.sql.Date;
import org.springframework.data.annotation.Transient;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class CursValutarDTO {

  @JsonIgnore
  private Long id;

  private String codValuta;

  private Integer rata;

  private Double curs;
  
  private Date data;
  
  CursValutarDTO(){
  }
  
  public CursValutarDTO(Long id, String codValuta, Integer rata, Double curs, Date data) {
    this.id = id;
    this.codValuta = codValuta;
    this.rata = rata;
    this.curs = curs;
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

  public Integer getRata() {
    return rata;
  }

  public void setRata(Integer rata) {
    this.rata = rata;
  }

  public Double getCurs() {
    return curs;
  }

  public void setCurs(Double curs) {
    this.curs = curs;
  }

  public Date getData() {
    return data;
  }

  public void setData(Date data) {
    this.data = data;
  }
  
}
