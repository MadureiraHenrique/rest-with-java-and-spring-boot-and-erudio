package br.com.erudio.services;

import br.com.erudio.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonService {

    AtomicLong cont = new AtomicLong();

    Logger logger = Logger.getLogger(PersonService.class.getName());

    public Person findById(String id) {
        logger.info("Finding one Person!");

        Person person = new Person();
        person.setId(cont.incrementAndGet());
        person.setFirstName("Carlos");
        person.setLastName("Henrique");
        person.setAdrees("Salvador - Bahia - Brasil");
        person.setGender("Male");
        return person;
    }

    public List<Person> findAll() {
        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            persons.add(MockPerson(i));
        }
        return persons;
    }

    private Person MockPerson(long i) {
        Person person = new Person();
        person.setId(i);
        person.setFirstName("Person First Name " + i);
        person.setLastName("Person Last Name");
        person.setAdrees("State - Location - Country");
        person.setGender("Person Gender");
        return person;
    }

    public Person create(Person person) {
        logger.info("Creating one Person!");
        return (person);
    }

    public Person update(Person person) {
        logger.info("Updating one Person!");
        return (person);
    }

    public void delete(String id) {
        logger.info("Deleting one Person!");
    }

}
