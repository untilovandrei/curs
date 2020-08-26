package com.entities;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.dto.CursValutarDTO;

@Entity
@Table(name = "curs_valutar")
public class CursValutar {
    
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  
  private String codValuta;
  
  private Integer rata;
  
  private Double curs;
  
  private Date data;

  public CursValutar() {
  }
  
  public CursValutar(String codValuta, Integer rata, Double curs, Date date) {
    this.codValuta = codValuta;
    this.rata = rata;
    this.curs = curs;
    this.data = date;
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

  public void setData(Date date) {
    this.data = date;
  }
  
  public CursValutarDTO convertToDTO(){
    return new CursValutarDTO(this.id, this.codValuta, this.rata, this.curs, this.data);
  }
  
}
