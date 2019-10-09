package com.example.springboothello.controller;

import javax.validation.Valid;

import com.example.springboothello.model.Account;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AccountController {
  @RequestMapping("add")
  public String toAdd(Account account) {
    return "addAcc";
  }

  @RequestMapping("addAccount")
  public String add(@Valid Account account, BindingResult result) {
    if (result.hasErrors()) {
      return "addAcc";
    }
    System.out.println("Save account = " + account);

    return "success";
  }
}