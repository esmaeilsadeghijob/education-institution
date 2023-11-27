package com.cando.uni.repository;

import com.cando.uni.model.person;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(collectionResourceRel = "Person",path="Person")
public interface PersonRepository extends PagingAndSortingRepository<person,Long> {
    @RestResource(path="FindByfname",rel = "FindByfname")
    person FindByfname(@Param("fname") String fname);
};
