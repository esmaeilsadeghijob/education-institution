package com.cando.uni.repository;

import com.cando.uni.model.Person;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource (collectionResourceRel = "person",path = "person")
public interface PersonRepository  extends PagingAndSortingRepository<Person,Long> {
}
