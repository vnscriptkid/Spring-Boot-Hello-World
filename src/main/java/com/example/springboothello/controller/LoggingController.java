package com.example.springboothello.controller;

import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {
  Logger logger = LoggerFactory.getLogger(this.getClass());

  @RequestMapping("/log")
  public Map<String, Object> helloLogging() {
    Map<String, Object> result = new HashMap<>();

    result.put("name", "Thanh");

    logger.info("This is a info message");
    logger.error("This is a error message");
    logger.warn("This is a warn message");

    return result;
  }
}