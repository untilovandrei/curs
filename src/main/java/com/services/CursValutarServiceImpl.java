package com.services;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dao.ICursValutarDAO;
import com.dto.CursValutarDTO;
import com.entities.CursValutar;

@Service
public class CursValutarServiceImpl implements ICursValutarService {

  @Autowired
  private ICursValutarDAO cursValutarDAO;

  @Override
  public CursValutarDTO findById(long id) {
    final CursValutar cursValutar = cursValutarDAO.findById(id);
    if(cursValutar != null) {
      return cursValutar.convertToDTO();
    }
    return null;
  }
  
  @Override
  public CursValutarDTO findByCodValuta(String codValuta) {
    final Date today = getToday();
    final CursValutar cursValutar = cursValutarDAO.findByCodValutaAndData(codValuta,today);
    if(cursValutar != null) {
      return cursValutar.convertToDTO();
    }
    return null;
  }

  @Override
  public String save(CursValutarDTO cursValutarDTO) {
    final Date today = getToday();
    CursValutar cursValutar = cursValutarDAO.findByCodValutaAndData(cursValutarDTO.getCodValuta(), today);
    if(cursValutar == null) {
      CursValutar newCursValutar = new CursValutar();
      newCursValutar.setCodValuta(cursValutarDTO.getCodValuta());
      newCursValutar.setCurs(cursValutarDTO.getCurs());
      newCursValutar.setRata(cursValutarDTO.getRata());
      newCursValutar.setData(new Date(System.currentTimeMillis()));
      cursValutarDAO.save(newCursValutar);
      return "saved";
    }
    return "curs exists";
  }

  @Override
  public String udpdate(CursValutarDTO cursValutarDTO) {
    CursValutar cursValutar = null;
    final Long cursId = cursValutarDTO.getId();
    Optional<CursValutar> opCursValutar = cursValutarDAO.findById(cursId);
    if(opCursValutar.isPresent()) {
      cursValutar = opCursValutar.get();
      cursValutar.setCodValuta(cursValutarDTO.getCodValuta());
      cursValutar.setCurs(cursValutarDTO.getCurs());
      cursValutar.setRata(cursValutarDTO.getRata());
      cursValutarDAO.save(cursValutar);
      return "updated";
    }
    return "curs not found";
  }
  
  private Date getToday() {
    Calendar cal = Calendar.getInstance(); // locale-specific
    cal.setTime(new Date(System.currentTimeMillis()));
    cal.set(Calendar.HOUR_OF_DAY, 0);
    cal.set(Calendar.MINUTE, 0);
    cal.set(Calendar.SECOND, 0);
    cal.set(Calendar.MILLISECOND, 0);
    long time = cal.getTimeInMillis();
    return new Date(time);
  }


  
  

}
