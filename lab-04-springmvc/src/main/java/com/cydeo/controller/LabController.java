package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class LabController {

    @RequestMapping("/labs")
    public String carInfo(Model model) {

        model.addAttribute("firstLab", "lab01");
        model.addAttribute("secondLab", "lab02");
        model.addAttribute("thirdLab", "lab03");
        model.addAttribute("fourthLab", "lab04");
        model.addAttribute("fifthLab", "lab05");

        return "lab/lab-list";
    }
}
