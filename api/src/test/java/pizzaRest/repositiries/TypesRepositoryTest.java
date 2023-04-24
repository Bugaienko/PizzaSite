package pizzaRest.repositiries;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import pizzaRest.models.TypeIngredient;
import pizzaRest.services.TypeService;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@DataJpaTest
class TypesRepositoryTest {

    @Autowired
    TypesRepository typesRepository;

    @Test
    public void findByNameTest(){
        String name = "Test Name";
        TypeIngredient typeIngredient = new TypeIngredient(name);
        typesRepository.save(typeIngredient);
        System.out.println(typesRepository.findByName(name).isPresent());
    }

}