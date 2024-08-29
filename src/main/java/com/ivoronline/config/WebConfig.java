package com.ivoronline.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfig {

  //PROPERTIES
  @Autowired ObjectMapper objectMapper;
  
  //=========================================================================================================
  // CUSTOMIZE OBJECT MAPPER
  //=========================================================================================================
  @PostConstruct
  void customizeObjectMapper() {
    objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
  }

}
