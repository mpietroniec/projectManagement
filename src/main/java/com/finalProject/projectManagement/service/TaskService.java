package com.finalProject.projectManagement.service;

import com.finalProject.projectManagement.model.dto.TaskDTO;
import com.finalProject.projectManagement.model.entity.Task;
import com.finalProject.projectManagement.repository.TaskRepository;
import org.modelmapper.ModelMapper;

import org.springframework.stereotype.Service;

@Service
public class TaskService {
    private TaskRepository taskRepository;
    private ModelMapper modelMapper;

    public TaskService(TaskRepository taskRepository, ModelMapper modelMapper) {
        this.taskRepository = taskRepository;
        this.modelMapper = modelMapper;
    }

    public void addTask(TaskDTO taskDTO){
        Task task = modelMapper.map(taskDTO, Task.class);

        task.setTaskName(taskDTO.getTaskName());

        taskRepository.save(task);
    }
}
