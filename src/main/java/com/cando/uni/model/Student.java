package com.cando.uni.model;

<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@PrimaryKeyJoinColumn(name = "id")
@Table(name = "Student")
public class Student extends Person {
    private long StudentNumber;

=======

public class Student extends Person{
>>>>>>> 54cdee60d1dbd2028a71103824aa67d520636e96
}
