package com.cando.uni.repository;

import com.cando.uni.model.Person;
import com.cando.uni.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.Optional;


@RepositoryRestResource(collectionResourceRel = "person",path = "person")
public interface RestPersonRepository extends JpaRepository<Person,Long> {


}
