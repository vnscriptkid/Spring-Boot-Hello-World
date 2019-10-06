package com.example.springboothello.controller;

import java.util.ArrayList;
import java.util.List;

import com.example.springboothello.model.Student;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentList {
  @RequestMapping("/list")
  public String list(Model model) {
    List<Student> list = new ArrayList<>();
    list.add(new Student(1, "Thanh", 9.2));
    list.add(new Student(2, "Dung", 5.6));
    list.add(new Student(3, "Khack", 6.7));
    model.addAttribute("list", list);
    return "list";
  }
}