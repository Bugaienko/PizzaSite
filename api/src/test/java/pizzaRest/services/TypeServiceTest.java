package pizzaRest.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extension;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import pizzaRest.RestPizzaApp;
import pizzaRest.config.CommonConfig;
import pizzaRest.models.TypeIngredient;
import pizzaRest.repositiries.TypesRepository;

import java.util.List;
import java.util.Optional;


import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment;


//@ExtendWith(SpringExtension.class)
//@ExtendWith(MockitoExtension.class)
//@AutoConfigureMockMvc


@SpringBootTest
class TypeServiceTest {


    //    @Mock
    @Autowired
    private TypeService typeService;

    @MockBean
    private TypesRepository typesRepository;

    @Test
    public void createTest() {
        String newName = "Test3";
        TypeIngredient typeIngredient1 = new TypeIngredient(newName);
        boolean isTypeCreated = typeService.create(typeIngredient1);

        Assertions.assertTrue(isTypeCreated);
    }

    @Test
    public void testTest() {
        System.out.println("port");
    }


}