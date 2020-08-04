package com.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.entities.CursValutar;
import com.services.ICursValutarService;

@Controller
@RequestMapping("cursValuar/")
public class CursValutarController {

  @Autowired
  private ICursValutarService cursValutarService;

  @GetMapping(value = "getAll")
  public List<CursValutar> getCursValutar() {

      List<CursValutar> cursValutarList = cursValutarService.findAll();

      return cursValutarList;
  }
  
}
