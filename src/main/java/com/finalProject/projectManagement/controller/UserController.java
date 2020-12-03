package com.finalProject.projectManagement.controller;

import com.finalProject.projectManagement.model.dto.HolderDTO;
import com.finalProject.projectManagement.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/registration")
    public ModelAndView getRegistrationView() {
        return new ModelAndView("registration", "newUser", new HolderDTO());
    }

    @PostMapping("/registration")
    public String registerNewUser(@ModelAttribute HolderDTO holderDTO) {
        System.out.println(holderDTO.getFirstName() + " " + holderDTO.getLastName());
        userService.addUser(holderDTO);
        return "/home";
    }
}
