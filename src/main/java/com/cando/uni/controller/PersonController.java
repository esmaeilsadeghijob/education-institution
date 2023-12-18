package com.cando.uni.controller;

import com.cando.uni.model.Person;
import com.cando.uni.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("person")
public class PersonController {
    @Autowired
    private PersonService personService;
    @GetMapping
    public List<Person> persons() {
        return personService.persons();
    }
    @PostMapping
    public Person save(@RequestBody Person person) {
        return personService.save(person);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        personService.delete(id);
    }

}
