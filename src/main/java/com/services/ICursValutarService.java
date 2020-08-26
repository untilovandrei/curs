package com.services;

import com.dto.CursValutarDTO;
import com.entities.CursValutar;

public interface ICursValutarService {
  public CursValutarDTO findById(long id);
  public String save(CursValutarDTO cursValutarDTO);
  public String udpdate(CursValutarDTO cursValutarDTO);
  public CursValutarDTO findByCodValuta(String codValuta);
  
}
