package com.cando.uni.model;

<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonInclude;
=======
>>>>>>> 54cdee60d1dbd2028a71103824aa67d520636e96
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

<<<<<<< HEAD
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

=======
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstname;
    private String lastname;
    private String phone;
>>>>>>> 54cdee60d1dbd2028a71103824aa67d520636e96
}
