package com.services;

import java.util.List;
import com.entities.CursValutar;

public interface ICursValutarService {
      List<CursValutar> findAll();
      void save(CursValutar cursValutar);
}
