package com.example.samir.webserivices.restfulwebservices.helloworld;

import com.example.samir.webserivices.restfulwebservices.helloworld.HelloWroldbean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@RestController
public class HelloWorldController {
    @Autowired
    private MessageSource messageSource;

    @GetMapping(path = "/hello-world")

    //@RequestMapping(method = RequestMethod.GET, path = "/hello-world")
    public String helloWrold() {
        return "hello world";
    }


    @GetMapping(path = "/hello-world-bean")

    //@RequestMapping(method = RequestMethod.GET, path = "/hello-world")
    public HelloWroldbean helloWroldbean() {
        return new HelloWroldbean("helloworldbean");
    }


    @GetMapping(path = "/hello-world/path-variable/{name}")

    public HelloWroldbean helloWrolPathVariable(@PathVariable String name) {
        return new HelloWroldbean(String.format("Hello World ,%s", name));
    }


    @GetMapping(path = "/hello-world-internationalized")
//@RequestHeader(name="Accept-Language",required = false Locale locale)
    public String helloWorldInternalized() {
       return   messageSource.getMessage("good.morning.message", null, LocaleContextHolder.getLocale());

    }
}
