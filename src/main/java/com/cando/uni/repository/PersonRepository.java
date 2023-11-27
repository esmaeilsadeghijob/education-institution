package com.cando.uni.repository;

import com.cando.uni.model.Person;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(collectionResourceRel="Preson",path="person")
public interface PersonRepository extends PagingAndSortingRepository<Person,Long> {
}
