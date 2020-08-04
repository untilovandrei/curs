package com.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dao.ICursValutarDAO;
import com.entities.CursValutar;

@Service
public class CursValutarServiceImpl implements ICursValutarService {

  @Autowired
  private ICursValutarDAO cursValutarDAO;

  @Override
  public List<CursValutar> findAll() {
    return cursValutarDAO.findAll();
  }

  @Override
  public void save(CursValutar cursValutar) {
    cursValutarDAO.save(cursValutar);
  }
  
  

}
