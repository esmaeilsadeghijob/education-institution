package com.cando.uni.repository;

import com.cando.uni.model.Person;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(collectionResourceRel = "person",path = "person")
public interface PersonRepository extends PagingAndSortingRepository<Person,Long> {
@RestResource(path = "serachByFirstname",rel = "serachByFirstname")
    Person findByFirstname(@Param("firstname") String firstname);
    @RestResource(path = "serachByLastname",rel = "serachByLastname")
    Person findByLastname(@Param("lastname") String lastname);

}


