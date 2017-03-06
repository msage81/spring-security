package com.sausage.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RenameMeController {
  public RenameMeController() {
    System.out.println("hele");
  }

  @RequestMapping("/yes")
  @ResponseBody
  public String doTheVillage(){
    return "Good job";
  }
}
