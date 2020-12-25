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




    @GetMapping(value = "/person/param",params = "version=1")
    public Person1 personv1(){
        return new Person1("b");
    }


    @GetMapping(value = "/person/param",params = "version=2")
    public Person2 personv2(){
        return new Person2(new Name("c","d"));
    }





    @GetMapping(value = "/person/header",headers = "X-API-VERSION=1")
    public Person1 headerv1(){
        return new Person1("b");
    }


    @GetMapping(value = "/person/header",headers = "X-API-VERSION=2")
    public Person2 headerv2(){
        return new Person2(new Name("c","d"));
    }



//---------------------this did not work ---------------------------

    /*@GetMapping(value = "/person/produces",produces = "application-vnd.company.app-v1+json")
    public Person1 producesv1(){
        return new Person1("b");
    }


    @GetMapping(value = "/person/produces",produces = "application-vnd.company.app-v2+json")
    public Person2 producesv2(){
        return new Person2(new Name("c","d"));
    }*/


//---------------------------------------------------------------------









}
