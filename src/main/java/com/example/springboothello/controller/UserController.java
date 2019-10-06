package com.example.springboothello.controller;

import java.util.ArrayList;
import java.util.List;

import com.example.springboothello.model.User;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
  @RequestMapping("demo")
  public String demo(Model model) {
    model.addAttribute("message", "Hello Thymeleaf");
    double grade = 90.5;
    model.addAttribute("grade", grade);
    model.addAttribute("GPA", convertGPA(grade));
    // return to templates/demo.html page.
    return "demo";
  }

  @RequestMapping("demo2")
  public String demo2(Model model) {
    List<User> list = new ArrayList<>();
    list.add(new User(1, "Thanh", 24));
    list.add(new User(2, "Dung", 24));
    list.add(new User(2, "Linh", 19));
    model.addAttribute("list", list);
    return "demo2";
  }

  private String convertGPA(double grade) {
    if (grade >= 90) {
      return "A";
    } else if (grade < 90 && grade >= 80) {
      return "B";
    } else if (grade < 80 && grade >= 70) {
      return "C";
    } else if (grade < 70 && grade >= 60) {
      return "D";
    } else {
      return "F";
    }
  }
}