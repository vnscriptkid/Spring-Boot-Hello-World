package com.example.springboothello;

import javax.annotation.Resource;

import com.example.springboothello.service.UserService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {
  @Resource
  private UserService userService;

  @Test
  public void testGetUser() {
    org.junit.Assert.assertEquals(userService.getUser(), "Tom");
  }
}