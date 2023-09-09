package com.cydeo.controller;

import com.cydeo.model.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

@Controller
public class ProfileController {

    @RequestMapping("/profile")
    public String carInfo(Model model) {
        Profile profile=new Profile();
        profile.setEmail("tonyMontana@gmail.com");
        profile.setPhoneNumber("12356478");
        profile.setName("Tony");
        profile.setSurname("Montana");
        profile.setUserName("tony2023");
        profile.setCreatedDate(LocalDateTime.now());

        model.addAttribute("profile",profile);


        return "profile/profile-info";
    }
}
