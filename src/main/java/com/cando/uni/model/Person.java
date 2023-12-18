package com.cando.uni.model;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "Person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "person_sec")
    @SequenceGenerator(name = "person_sec",sequenceName = "person_sec",allocationSize = 50)
    private Long id;
    private String fName;
    private String lName;
    @Enumerated(EnumType.STRING)
    private PersonType personType;
    private String address;
    private String phone;
    private String email;
    private int age;

}
