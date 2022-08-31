package com.example.predestroy;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class MyBean {
  public MyBean() {
    System.out.println("MyBean instance created.");
  }  

  @PostConstruct
  private void init() {
    System.out.println("Verifying resources");
  }

  @PreDestroy
  private void shutdown() {
    System.out.println("Shutdown All Resources");
  }

  public void close() {
    System.out.println("Closing All Resources");
  }
}
