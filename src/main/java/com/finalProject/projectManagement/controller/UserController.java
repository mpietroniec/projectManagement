package com.finalProject.projectManagement.controller;

import com.finalProject.projectManagement.model.dto.UserDTO;
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
        return new ModelAndView("registration", "newUser", new UserDTO());
    }

    @PostMapping("/registration")
    public String registerNewUser (@ModelAttribute UserDTO userDTO) {
        System.out.println(userDTO.getFirstName() + " " + userDTO.getLastName());
        userService.addUser(userDTO);
        return "login";
    }
}
