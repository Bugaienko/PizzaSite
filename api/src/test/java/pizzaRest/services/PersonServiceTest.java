//package pizzaRest.services;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
////import pizzaRest.config.TestBeansContextConfig;
//import pizzaRest.models.Person;
//
////@RequiredArgsConstructor(onConstructor = @__(@Autowired))
////@ImportAutoConfiguration
////@ExtendWith(SpringExtension.class)
////@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = PersonServiceTest.class)
////@RunWith(SpringRunner.class)
////@ContextConfiguration(classes = CommonConfig.class)
//@SpringBootTest
//class PersonServiceTest {
//
//
//    private final PersonService personService;
//
//    @Autowired
//    PersonServiceTest(PersonService personService) {
//        this.personService = personService;
//    }
//
//    @Test
//    public void findAll() {
//        Person person = new Person("Test", "test", "email@email.com");
//        System.out.println(personService.save(person));
//        System.out.println(personService.findAll());
//    }
//}