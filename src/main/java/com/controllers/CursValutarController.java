package com.controllers;

import javax.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.dto.CursValutarDTO;
import com.entities.CursValutar;
import com.services.ICursValutarService;

@Controller
//@RequestMapping(value = "cvController")
public class CursValutarController {

  @Autowired
  private ICursValutarService cursValutarService;

  @GetMapping(value = "findById")
  //@RequestMapping(method = RequestMethod.GET ,value = "findById")
  @ResponseBody
  public CursValutarDTO getCursValutarById(@RequestParam (value = "id") Long id ) {
    CursValutarDTO cursValutar = cursValutarService.findById(id);
    return cursValutar;
  }
  
  @GetMapping(value = "findByValuta")
  @ResponseBody
  public CursValutarDTO getCursValutarByValuta(@RequestParam (value = "valuta") String codValuta ) {
    CursValutarDTO cursValutarDTO = cursValutarService.findByCodValuta(codValuta);
    return cursValutarDTO;
  }
  
  @PostMapping(value = "save")
  @ResponseBody
  public String saveCursValutarBy(@RequestBody final CursValutarDTO cursValutarDTO) {
    String result = cursValutarService.save(cursValutarDTO);
    return result;
  }
  
  
  @PostMapping(value = "update")
  @ResponseBody
  public String updateCursValutarBy(@RequestBody final CursValutarDTO cursValutarDTO) {
    if(cursValutarDTO.getId() != null) {
      cursValutarService.udpdate(cursValutarDTO);
      return "updated";
    } else {
      return "unknown entity";
    }
  }
  
}
