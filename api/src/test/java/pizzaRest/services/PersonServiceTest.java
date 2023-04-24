package pizzaRest.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pizzaRest.repositiries.PersonRepository;

//@ImportAutoConfiguration
//@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = PersonServiceTest.class)
class PersonServiceTest {

    private final PersonRepository personRepository;

    @Autowired
    PersonServiceTest(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Test
    public void findAll() {
    }
}