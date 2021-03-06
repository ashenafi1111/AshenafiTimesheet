package com.example.demo.Model.News;

import com.example.demo.User;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Interest {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "interests")
    private Set<User> users = new HashSet<>();



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
