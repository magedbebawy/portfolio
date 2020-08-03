package com.example.newPortfolio;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class homeController {

    @GetMapping
    public String displayHome(Model model){
        return "home/index";
    }
    @GetMapping("projects")
    public String displayProjects(Model model){
        return "other/projects";
    }
    @GetMapping("resume")
    public String displayResume(Model model){
        return "other/resume";
    }
    @GetMapping("contact")
    public String displayContact(Model model){
        return "other/contact";
    }

}
