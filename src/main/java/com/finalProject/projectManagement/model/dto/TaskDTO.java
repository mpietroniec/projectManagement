package com.finalProject.projectManagement.model.dto;

import com.finalProject.projectManagement.model.entity.User;

public class TaskDTO {
    private Long id;
    private String taskName;
    private User holder;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public User getHolder() {
        return holder;
    }

    public void setHolder(User holder) {
        this.holder = holder;
    }
}
