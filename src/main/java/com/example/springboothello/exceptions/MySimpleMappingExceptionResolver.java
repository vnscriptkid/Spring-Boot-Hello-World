package com.example.springboothello.exceptions;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

@Configuration
public class MySimpleMappingExceptionResolver {
  @Bean
  public SimpleMappingExceptionResolver getSimpleMappingExceptionResolver() {
    SimpleMappingExceptionResolver resolver = new SimpleMappingExceptionResolver();

    Properties mappings = new Properties();
    // exception full name , view name
    mappings.put("java.lang.ArithmeticException", "mathError");
    mappings.put("java.lang.ArithmeticException", "nullPointerError");
    resolver.setExceptionMappings(mappings);

    return resolver;
  }
}