package com.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dao.CursValutarDAO;
import com.entities.CursValutar;

@Service
public class CursValutarServiceImpl implements ICursValutarService {

  @Autowired
  private CursValutarDAO cursValutarDAO;

  @Override
  public List<CursValutar> findAll() {
    // TODO Auto-generated method stub
    return null;
  }

}