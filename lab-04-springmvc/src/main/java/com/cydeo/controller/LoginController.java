package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/login")
public class LoginController {

    @RequestMapping()       //localhost:8080/login?email=Tony&phoneNumber=123456
    public String logIn(@RequestParam(value = "email")String email, @RequestParam(value = "phoneNumber",required = false,defaultValue = "111111111111111111111111")String phoneNumber, Model model){

        model.addAttribute("email",email);
        model.addAttribute("phoneNumber",phoneNumber);
        model.addAttribute("loginMessage","Login successfully");

        return "login/login-info";
    }
}
