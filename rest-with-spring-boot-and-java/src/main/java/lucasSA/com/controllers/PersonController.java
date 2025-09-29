package lucasSA.com.controllers;

import lucasSA.com.model.Person;
import lucasSA.com.services.PersonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonServices personServices;

    @GetMapping("/{id}")
    public Optional<Person> findByID(@PathVariable Long id){
        return personServices.findById(id);
    }

    @GetMapping("/findAll")
    public List<Person> findAll(){
        return  personServices.findAll();
    }

    @PostMapping("/create")
    public Person create(@RequestBody Person person){
        return personServices.create(person);
    }

    @PutMapping("/update")
    public Person update(@RequestBody Person person){
        return personServices.update(person);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id){
        personServices.delete(id);
        return ResponseEntity.noContent().build();
    }



}
