package com.example.test2.service;

import com.example.test2.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

//    private List<PersonService> getAllPersonServices() {
//        List<P> personServices = new ArrayList<>();
//        personServices = personRepository.findAll();
//        return personServices;
//    }
}
