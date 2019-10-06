package com.example.springboothello.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class UploadController {
  Map<String, Object> result = new HashMap<>();

  @RequestMapping("/uploadFile")
  public Map<String, Object> upload(@RequestParam("attach") MultipartFile file) throws IOException {
    // Log file info
    System.out.println("File name: " + file.getOriginalFilename());
    System.out.println("File type: " + file.getContentType());

    // Save file to disk
    String filePath = "d:\\workspace\\java\\spring-boot-hello\\uploaded\\";
    file.transferTo(new File(filePath + file.getOriginalFilename()));

    result.put("Success", true);
    return result;
  }

}