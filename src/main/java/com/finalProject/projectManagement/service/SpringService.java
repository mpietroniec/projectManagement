package com.finalProject.projectManagement.service;

import com.finalProject.projectManagement.repository.UserRepository;
import org.springframework.stereotype.Service;
import com.finalProject.projectManagement.model.entity.User;

@Service
public class SpringService {
    private UserRepository userRepository;

    public SpringService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void saveUser() {
        User user = new User();
        user.setFirstname("abc");
        user.setLastname("Pietroniec");
        user.setMail("abc@abc.com");
        user.setLogin("Marc");
        user.setPassword("1234");
        user.setStatus("projektant");

        userRepository.save(user);
    }
}
