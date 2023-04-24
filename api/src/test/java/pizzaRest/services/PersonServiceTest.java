package pizzaRest.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import pizzaRest.RestPizzaApp;
import pizzaRest.repositiries.PersonRepository;

//@ImportAutoConfiguration
@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = RestPizzaApp.class)
class PersonServiceTest {




    private final PersonService personService;

    private final PersonRepository personRepository;

    @Autowired
    PersonServiceTest(PersonService personService, PersonRepository personRepository) {
        this.personService = personService;
        this.personRepository = personRepository;
    }


    @Test
    void findAll() {
    }
}