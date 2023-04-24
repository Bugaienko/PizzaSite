//package pizzaRest.services;
//
//import lombok.RequiredArgsConstructor;
//import org.hibernate.service.spi.InjectService;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.context.TestConfiguration;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Import;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.context.support.AnnotationConfigContextLoader;
//import pizzaRest.RestPizzaApp;
//import pizzaRest.config.CommonConfig;
////import pizzaRest.config.TestBeansContextConfig;
//import pizzaRest.models.Person;
//import pizzaRest.repositiries.PersonRepository;
//
////@RequiredArgsConstructor(onConstructor = @__(@Autowired))
////@ImportAutoConfiguration
//@ExtendWith(SpringExtension.class)
////@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = PersonServiceTest.class)
////@RunWith(SpringRunner.class)
////@ContextConfiguration(classes = CommonConfig.class)
//@SpringBootTest(classes = PersonServiceTest.class)
//class PersonServiceTest {
//
//
//
//    @Test
//    public void findAll() {
//        Person person = new Person("Test", "test", "email@email.com");
////        System.out.println(personService.save(person));
////        System.out.println(personService.findAll());
//    }
//}