package com.finalProject.projectManagement.service;

import com.finalProject.projectManagement.model.dto.UserDTO;
import com.finalProject.projectManagement.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import com.finalProject.projectManagement.model.entity.User;


@Service
public class UserService {
    private UserRepository userRepository;
    private ModelMapper modelMapper;

    public UserService(ModelMapper modelMapper, UserRepository userRepository) {
        this.modelMapper = modelMapper;
        this.userRepository = userRepository;
    }

    public void addUser(UserDTO userDTO){
        User user = modelMapper.map(userDTO, User.class);
        user.setFirstname(userDTO.getFirstName());
        user.setLastname(userDTO.getLastName());
        user.setMail("abc@abc.com");
        user.setLogin("Marc");
        user.setPassword("1234");
        user.setStatus("projektant");
        userRepository.save(user);
    }

//    public void saveUser() {
//        User user = new User();
//        user.setFirstname("Paweł");
//        user.setLastname("Pietroniec");
//        user.setMail("abc@abc.com");
//        user.setLogin("Marc");
//        user.setPassword("1234");
//        user.setStatus("projektant");
//
//        userRepository.save(user);
//    }
}
