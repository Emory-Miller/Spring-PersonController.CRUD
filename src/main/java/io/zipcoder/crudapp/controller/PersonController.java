package io.zipcoder.crudapp.controller;

import io.zipcoder.crudapp.models.Person;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/people")
public class PersonController {

    @PostMapping
    public Person createPerson(@RequestBody Person p){
        return null;
    }

    @GetMapping("/{id}")
    public Person getPerson(@PathVariable int id){
        return null;
    }

    @GetMapping
    List<Person> getPersonList(){

        return null;
    }

    @PutMapping("/{id}")
    public Person updatePerson(@RequestBody Person p, @PathVariable int id){
        return null;
    }

    @DeleteMapping("/{id}")
    public void DeletePerson(@PathVariable int id){}

}
