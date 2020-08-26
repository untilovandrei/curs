package com.dto;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.dto.CursValutarDTO;


public class NumerarDTO {
  
    Long id;
    String utilizator;
    String codValuta;
    Double suma;
    Date date;
    
    public NumerarDTO() {
    }
    
    public NumerarDTO(Long id, String utilizator, String codValuta, Double suma, Date date) {
      super();
      this.id = id;
      this.utilizator = utilizator;
      this.codValuta = codValuta;
      this.suma = suma;
      this.date = date;
    }
    
    public String getUtilizator() {
      return utilizator;
    }
    
    public void setUtilizator(String utilizator) {
      this.utilizator = utilizator;
    }
    
    public String getCodValuta() {
      return codValuta;
    }
    
    public void setCodValuta(String codValuta) {
      this.codValuta = codValuta;
    }
    
    public Double getSuma() {
      return suma;
    }
    
    public void setSuma(Double suma) {
      this.suma = suma;
    }
    
    public Date getDate() {
      return date;
    }
    
    public void setDate(Date date) {
      this.date = date;
    }
}
