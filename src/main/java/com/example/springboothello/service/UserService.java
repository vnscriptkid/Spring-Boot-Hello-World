package com.example.springboothello.service;

import javax.annotation.Resource;

import com.example.springboothello.dao.UserDao;

import org.springframework.stereotype.Service;

@Service
public class UserService {
  @Resource
  private UserDao userDao;

  public String getUser() {
    return userDao.getUser();
  }

}