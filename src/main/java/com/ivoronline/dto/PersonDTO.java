package com.ivoronline.dto;

import lombok.Data;

@Data
public class PersonDTO {
  private String  name;
  private Integer age;
  private Boolean isEmployee = false;
}
