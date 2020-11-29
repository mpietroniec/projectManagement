package com.finalProject.projectManagement.model.dto;

import com.finalProject.projectManagement.model.entity.User;
import java.util.ArrayList;
import java.util.List;

public class TeamDTO {
    private Long id;
    private String teamName;
    private List<User> users = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
