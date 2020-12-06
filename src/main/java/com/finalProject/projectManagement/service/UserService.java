package com.finalProject.projectManagement.service;

import com.finalProject.projectManagement.model.dto.HolderDTO;
import com.finalProject.projectManagement.model.dto.TaskDTO;
import com.finalProject.projectManagement.model.entity.Holder;
import com.finalProject.projectManagement.model.entity.Task;
import com.finalProject.projectManagement.repository.TaskRepository;
import com.finalProject.projectManagement.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class UserService {
    private TaskRepository taskRepository;
    private UserRepository userRepository;
    private ModelMapper modelMapper;
    private PasswordEncoder passwordEncoder;


    public UserService(ModelMapper modelMapper, UserRepository userRepository, PasswordEncoder passwordEncoder,TaskRepository taskRepository) {
        this.modelMapper = modelMapper;
        this.userRepository = userRepository;
        this.taskRepository = taskRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public void addUser(HolderDTO holderDTO){
        Holder holder = modelMapper.map(holderDTO, Holder.class);

        holder.setFirstName(holderDTO.getFirstName());
        holder.setLastName(holderDTO.getLastName());
        holder.setMail(holderDTO.getMail());
        holder.setLogin(holderDTO.getLogin());
        holder.setPassword(passwordEncoder.encode(holderDTO.getPassword()));
        holder.setStatus(holderDTO.getStatus());

        userRepository.save(holder);
    }

    public void addTask(TaskDTO taskDTO){
        Task task = modelMapper.map(taskDTO, Task.class);

        task.setTaskName(taskDTO.getTaskName());

        taskRepository.save(task);
    }

    public List<TaskDTO> getAllTasks(){
        return taskRepository.findAll()
                .stream()
                .map(task -> modelMapper.map(task, TaskDTO.class))
                .collect(Collectors.toList());
    }

}
