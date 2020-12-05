package com.finalProject.projectManagement.service;

import com.finalProject.projectManagement.model.dto.HolderDTO;
import com.finalProject.projectManagement.model.entity.Holder;
import com.finalProject.projectManagement.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class UserService {
    private UserRepository userRepository;
    private ModelMapper modelMapper;
    private PasswordEncoder passwordEncoder;


    public UserService(ModelMapper modelMapper, UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.modelMapper = modelMapper;
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public void addUser(HolderDTO holderDTO){
        Holder holder = modelMapper.map(holderDTO, Holder.class);
        holder.setFirstName(holderDTO.getFirstName());
        holder.setLastName(holderDTO.getLastName());
        holder.setMail("abc@abc.com");
        holder.setLogin(holderDTO.getLogin());
        holder.setPassword(passwordEncoder.encode(holderDTO.getPassword()));
        holder.setStatus("projektant");
        userRepository.save(holder);
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
