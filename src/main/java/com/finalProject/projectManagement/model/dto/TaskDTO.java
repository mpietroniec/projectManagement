package com.finalProject.projectManagement.model.dto;

import com.finalProject.projectManagement.model.entity.Holder;

public class TaskDTO {
    private Long id;
    private String taskName;
    private Holder holder;

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

    public Holder getHolder() {
        return holder;
    }

    public void setHolder(Holder holder) {
        this.holder = holder;
    }
}
