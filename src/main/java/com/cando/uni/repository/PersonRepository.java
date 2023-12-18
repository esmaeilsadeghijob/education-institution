package com.cando.uni.repository;

import com.cando.uni.model.Person;
<<<<<<< HEAD
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person,Long> {
}
=======
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


>>>>>>> 54cdee60d1dbd2028a71103824aa67d520636e96
