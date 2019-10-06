package com.example.springboothello.model;

public class Student {
  private Integer id;
  private String name;
  private Double grade;

  public Student(Integer id, String name, Double grade) {
    this.id = id;
    this.name = name;
    this.grade = grade;
  }

  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getGrade() {
    return this.grade;
  }

  public void setGrade(Double grade) {
    this.grade = grade;
  }
}