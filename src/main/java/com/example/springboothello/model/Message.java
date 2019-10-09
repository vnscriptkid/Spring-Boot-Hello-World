package com.example.springboothello.model;

public class Message {
  private String content;

  public Message() {
  }

  public Message(String content) {
    this.content = content;
  }

  public String getContent() {
    return this.content;
  }

  public void setContent(String content) {
    this.content = content;
  }
}