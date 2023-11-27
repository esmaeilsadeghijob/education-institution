package com.cando.uni.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Data
@Entity
public class Person {
    @Id
    private Long id;
    private String username;
    private String password;
    private String email;
    private String phone;
}
