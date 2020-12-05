package com.finalProject.projectManagement.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class IndexController {
    @GetMapping(value = {"/", "/index"})
    public ModelAndView test() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        return new ModelAndView("index", "login2", authentication.getName() + " " + authentication.getAuthorities());
//    public String test(){return "index";}
    }

    @GetMapping("/home")
    public String home(){ return "home"; }

}
