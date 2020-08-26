package com.services;

import java.sql.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dao.INumerarDAO;
import com.dto.NumerarDTO;
import com.entities.Numerar;

@Service
public class NumerarServiceImpl implements INumerarService {

  @Autowired
  private INumerarDAO numerarDAO;

  @Override
  public String udpdateNumerar(NumerarDTO numerarDTO) {
    final String utilizator = numerarDTO.getUtilizator();
    final String codValuta = numerarDTO.getCodValuta();
    final Double sumaN = numerarDTO.getSuma();
    final Date data = numerarDTO.getDate();
    Numerar numerar = numerarDAO.findByUtilizatorAndCodValutaAndData(utilizator, codValuta, data);
    if(numerar != null ) {
      numerar.setSuma(sumaN);
      numerarDAO.save(numerar);
      return "updated";
    }
    return "not found";
  }

  @Override
  public String save(NumerarDTO numerarDTO) {
    final String utilizator = numerarDTO.getUtilizator();
    final String codValuta = numerarDTO.getCodValuta();
    final Double suma = numerarDTO.getSuma();
    final Date data = numerarDTO.getDate();
    Numerar numerar = numerarDAO.findByUtilizatorAndCodValutaAndSumaAndData(utilizator, codValuta, suma, data);
    if(numerar == null) {
      Numerar newNumerar = new Numerar();
      newNumerar.setUtilizator(utilizator);
      newNumerar.setCodValuta(codValuta);
      newNumerar.setSuma(suma);
      newNumerar.setDate(data);
      numerarDAO.save(newNumerar);
      return "saved";
    }
    return "numerar exists";
  }

}
