package com.finalProject.projectManagement.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "holder")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstname;
    private String lastname;
    private String mail;
    private String login;
    private String password;
    private String position;


//    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private Task task;
//
//    @ManyToOne(cascade = CascadeType.ALL)
//    private Team teamId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

//    public Task getTask() {
//        return task;
//    }
//
//    public void setTask(Task task) {
//        this.task = task;
//    }
//
//    public Team getTeamId() {
//        return teamId;
//    }
//
//    public void setTeamId(Team teamId) {
//        this.teamId = teamId;
//    }
}
