package com.cando.uni.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id ;
    private String sname;
    private String fname;
    private String nationalcode;

}
