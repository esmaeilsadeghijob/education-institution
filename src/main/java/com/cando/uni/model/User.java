package com.cando.uni.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    private Long id;
    private String username;
    private String password;
    private String email;
    private String phone;
}
