package com.ivoronline.controller;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ivoronline.dto.PersonDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  //================================================================
  // HELLO
  //================================================================
  @RequestMapping("Hello")
  PersonDTO hello(@RequestBody PersonDTO personDTO) {
    return personDTO;
  }

}
