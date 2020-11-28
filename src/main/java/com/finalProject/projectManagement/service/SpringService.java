package com.finalProject.projectManagement.service;

import com.finalProject.projectManagement.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class SpringService {
    private com.finalProject.projectManagement.repository.UserRepository userRepository;

    public SpringService(com.finalProject.projectManagement.repository.UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void saveUser() {
        com.finalProject.projectManagement.model.entity.User user = new com.finalProject.projectManagement.model.entity.User();
        user.setFirstname("Marcin");
        user.setLastname("Pietroniec");
        user.setMail("abc@abc.com");
        user.setLogin("Marc");
        user.setPassword("1234");
        user.setPosition("projektant");

        userRepository.save(user);
    }
}
