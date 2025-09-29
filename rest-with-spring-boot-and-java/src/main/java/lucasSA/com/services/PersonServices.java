package lucasSA.com.services;

import lucasSA.com.model.Person;
import lucasSA.com.repositorys.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServices {

    @Autowired
    private PersonRepository personRepository;

    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    public List<Person> findAll(){
        return personRepository.findAll();
    }

    public Optional<Person> findById(Long id){
        logger.info("finding one person!");
        return personRepository.findById(id);
    }

    public Person create(Person person){
        personRepository.save(person);
        return person;
    }

    public Person update(Person person){
        Person personUpdate = personRepository.findById(person.getId()).get();
        personUpdate.setName(person.getName());
        personUpdate.setLastName(person.getLastName());
        personUpdate.setAdrees(person.getAdrees());
        personRepository.saveAndFlush(personUpdate);
        return personUpdate;
    }

    public void delete(Long id){
        logger.info("Delete person!");
        personRepository.deleteById(id);
    }


}
