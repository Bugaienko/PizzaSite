package pizzaRest.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.ActiveProfiles;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
import pizzaRest.RestPizzaApp;
import pizzaRest.config.TestConfig;
import pizzaRest.models.Person;
import pizzaRest.repositiries.PersonRepository;

/**
 * @author Sergii Bugaienko
 */


//@ExtendWith(SpringExtension.class)
//@ActiveProfiles("test")
//@ContextConfiguration(classes = {TestConfig.class, PersonRepository.class, PersonService.class, RestPizzaApp.class})
//@SpringBootTest
public class ServiceAutowiredTest {



    @Test
    public void test(){
        Assertions.assertEquals(true, false);;

//        Person person = new Person("Test", "test", "email@email.com");
//        personService.save(person);
////        System.out.println(bool);
//        personService.findAll();
////        System.out.println(people);
    }
}
