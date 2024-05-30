package com.northcoders.demospringbootapp.controller;


import com.northcoders.demospringbootapp.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/v1")
public class DemoController {

    @GetMapping("/hello")
    public String getGreeting(){
        return "Hello There First Spring boot project, well exited !";
    }

    @GetMapping("/person")
    public List<Person> getPerson(){

        List<Person> personList = Arrays.asList(
                new Person("Nada", 22, "absd@.com", "London", "Pizza"),
                new Person("Bill", 43, "email@.com", "Brazil", "Cod Fish")
        );
        return personList;

    }


}
