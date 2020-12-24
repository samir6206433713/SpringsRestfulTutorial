package com.example.samir.webserivices.restfulwebservices.filtring;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.MappingJsonFactory;
import com.fasterxml.jackson.databind.ser.BeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import net.minidev.json.annotate.JsonIgnore;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
@JsonIgnoreProperties(value = {"field2"})
@RestController
public class FiltringController {
 @GetMapping("/fieltring")
    public MappingJacksonValue retriveSomeBean(){
        SomeBean someBean=  new SomeBean("v1","v2,","v3");

     SimpleBeanPropertyFilter filter= SimpleBeanPropertyFilter.filterOutAllExcept("field1","field2");
     FilterProvider filters= new SimpleFilterProvider().addFilter("SomeBeanFilter",filter);
     MappingJacksonValue mapping = new MappingJacksonValue(someBean);

     mapping.setFilters(filters);

     return  mapping;
    }


   /* @GetMapping("/listfiltering-list")
    public List<SomeBean> retrivalListOfSomeBean{
     return Arrays.asList(new SomeBean("a","b","c"),new SomeBean("aa","bb","cc"));
    }*/
}
