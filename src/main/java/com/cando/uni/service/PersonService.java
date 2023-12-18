package com.cando.uni.service;

import com.cando.uni.model.Person;
import com.cando.uni.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public List<Person> persons(){
        return personRepository.findAll();
    }

    public Person save(Person person) {

        return personRepository.save(person);
    }

    public void delete(Long id) {
        personRepository.deleteById(id);
    }


}
