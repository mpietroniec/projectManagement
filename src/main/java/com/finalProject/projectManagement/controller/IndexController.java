package com.finalProject.projectManagement.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;

@Controller
public class IndexController {
    @GetMapping("/index")
    public ModelAndView index() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        return new ModelAndView("index", "login", authentication.getName() + " " + authentication.getAuthorities());
//    public String test(){return "index";}
    }

    @GetMapping("/home")
    public String home(){ return "home"; }

}
