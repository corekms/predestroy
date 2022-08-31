package com.example.predestroy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class Configuration {

  @Bean
  @Scope(value="singleton") 
  public MyBean MyBean() {
    return new MyBean();
  }
}
