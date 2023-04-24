package pizzaRest.services;

import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import pizzaRest.repositiries.PersonRepository;

//@RequiredArgsConstructor(onConstructor = @__(@Autowired))
//@ImportAutoConfiguration
//@ExtendWith(SpringExtension.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = PersonServiceTest.class)
@SpringBootTest
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