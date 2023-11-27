package com.cando.uni.repository;

import com.cando.uni.model.person;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "Person",path="Person")
public interface PersonRepository extends PagingAndSortingRepository<person,Long> {
}
