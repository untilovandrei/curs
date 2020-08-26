package com.entities;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.dto.CursValutarDTO;
import com.dto.NumerarDTO;

@Entity
@Table(name = "Numerar")
public class Numerar {
  
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String utilizator;
    String codValuta;
    Double suma;
    Date data;
    
    public Numerar() {
    }
    
    public Numerar(String utilizator, String codValuta, Double suma, Date data) {
      super();
      this.utilizator = utilizator;
      this.codValuta = codValuta;
      this.suma = suma;
      this.data = data;
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
      return data;
    }
    
    public void setDate(Date data) {
      this.data = data;
    }
    
    public NumerarDTO convertToDTO(){
      return new NumerarDTO(this.id, this.utilizator, this.codValuta, this.suma, this.data);
    }
}
