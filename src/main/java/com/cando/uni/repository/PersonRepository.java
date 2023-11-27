package com.cando.uni.repository;

import com.cando.uni.model.Person;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(collectionResourceRel="Preson",path="person")
public interface PersonRepository extends PagingAndSortingRepository<Person,Long> {
    @RestResource(rel="findByName",path="findByName")
    Person findByName(@Param("name") String name);
    @RestResource(rel="findByAddress",path="findByAddress")
    Person findByAddress(@Param("address") String address);
}
