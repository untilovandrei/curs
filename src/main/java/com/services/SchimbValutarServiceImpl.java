package com.services;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dao.ICursValutarDAO;
import com.dao.INumerarDAO;
import com.dao.ISchimbValutarDAO;
import com.dto.CursValutarDTO;
import com.dto.NumerarDTO;
import com.dto.SchimbValutarDTO;
import com.entities.CursValutar;
import com.entities.Numerar;
import com.entities.SchimbValutar;

@Service
public class SchimbValutarServiceImpl implements ISchimbValutarService {

  @Autowired
  private ISchimbValutarDAO schimbValutarDAO;

  @Override
  public String exchange(SchimbValutarDTO schimbValutarDTO) {
    final Double sumaEliberata = getAmount(schimbValutarDTO.getSumaEliberata());
    final Double sumaPrimita = schimbValutarDTO.getSumaPrimita();
    final Double curs = schimbValutarDTO.getCursSchimb();
    final String codValuta = schimbValutarDTO.getCodValuta();
    final Date data = new Date(System.currentTimeMillis());
    SchimbValutar schimbValutar = new SchimbValutar(codValuta, curs, sumaPrimita, sumaEliberata, data);
    schimbValutarDAO.save(schimbValutar);
    return "exchange completed";
  }

  private Double getAmount(String sumaEliberata) {
     
    String[] arrOfStr = sumaEliberata.split("\\*");
    Double ammount = 0d;
    if(arrOfStr.length == 2) {
      ammount = Double.valueOf(arrOfStr[0]) * Double.valueOf(arrOfStr[1]);
    }
    return ammount;
  }

}
