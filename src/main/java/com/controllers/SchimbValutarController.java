package com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.dto.SchimbValutarDTO;
import com.services.ISchimbValutarService;

@Controller
@RequestMapping(value = "schimb")
public class SchimbValutarController {

  @Autowired
  private ISchimbValutarService schimbValutarService;
  
  @PostMapping(value = "save")
  @ResponseBody
  public String exchange(@RequestBody final SchimbValutarDTO schimbValutarDTO) {
      final String result = schimbValutarService.exchange(schimbValutarDTO);
      return result;
  }
  
}
