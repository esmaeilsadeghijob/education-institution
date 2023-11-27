package com.cando.uni.repository;

import com.cando.uni.model.Person;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.annotation.Resource;

@RepositoryRestResource (collectionResourceRel = "person",path = "person")
public interface PersonRepository  extends PagingAndSortingRepository<Person,Long> {
@RestResource(rel ="findbyusername",path = "findbyusername")
    Person findByusername(@Param("UserName") String username);


}
