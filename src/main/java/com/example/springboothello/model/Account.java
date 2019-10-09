package com.example.springboothello.model;

import javax.validation.constraints.NotBlank;

public class Account {
  @NotBlank(message = "username can not be empty")
  private String name;
  @NotBlank(message = "password can not be empty")
  private String password;

  public Account(String name, String password) {
    this.name = name;
    this.password = password;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPassword() {
    return this.password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String toString() {
    return "Account(Name: " + this.name + ", Password: " + this.password + ")";
  }
}