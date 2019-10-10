package com.example.springboothello.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@EnableScheduling
@Configuration
public class SchedulerConfig {
  @Autowired
  SimpMessagingTemplate template;

  @Scheduled(fixedDelay = 2000)
  public void sendAdhocMessages() {
    template.convertAndSend("/topic/user", "Scheduler each 2000 ms");
  }
}