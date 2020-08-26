package com.controllers;

import javax.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.dto.CursValutarDTO;
import com.dto.NumerarDTO;
import com.entities.CursValutar;
import com.services.ICursValutarService;
import com.services.INumerarService;

@Controller
@RequestMapping(value = "numerar")
public class NumerarController {

  @Autowired
  private INumerarService numerarService;

  @PostMapping(value = "save")
  @ResponseBody
  public String saveNumerar(@RequestBody final NumerarDTO numerarDTO) {
    String result = numerarService.save(numerarDTO);
    return result;
  }
  
  
  @PutMapping(value = "update")
  @ResponseBody
  public String updateNumerar(@RequestBody final NumerarDTO numerarDTO) {
      final String result = numerarService.udpdateNumerar(numerarDTO);
      return result;
  }
  
}
