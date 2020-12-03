package com.finalProject.projectManagement.model.dto;

import com.finalProject.projectManagement.model.entity.Holder;
import java.util.ArrayList;
import java.util.List;

public class TeamDTO {
    private Long id;
    private String teamName;
    private List<Holder> holders = new ArrayList<>();

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

    public List<Holder> getUsers() {
        return holders;
    }

    public void setUsers(List<Holder> holders) {
        this.holders = holders;
    }
}
