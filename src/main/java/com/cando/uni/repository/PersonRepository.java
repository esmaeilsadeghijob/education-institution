package com.cando.uni.repository;

import com.cando.uni.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "person", path = "person")
public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {

    @RestResource(path = "searchByFirstname", rel = "searchByFirstname")
    Person findByFirstname(@Param("firstname") String firstname);

    @RestResource(path = "searchByAddress", rel = "searchByAddress")
    List<Person> findByAddress(@Param("address") String address);

}
