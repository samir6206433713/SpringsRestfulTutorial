package com.example.samir.webserivices.restfulwebservices.versoning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonVersoningControler {

    @GetMapping("v1/person")
    public Person1 person1(){
        return new Person1("b");
    }
    @GetMapping("v2/person")
    public Person2 person2(){
        return new Person2(new Name("c","d"));
    }
}
