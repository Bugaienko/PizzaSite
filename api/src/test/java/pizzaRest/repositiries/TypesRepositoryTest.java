//package pizzaRest.repositiries;
//
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.test.context.ActiveProfiles;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//import pizzaRest.models.TypeIngredient;
//
//@ExtendWith(SpringExtension.class)
//@DataJpaTest
//@ActiveProfiles("test")
////@SpringBootTest
//class TypesRepositoryTest {
//
//
//    private final TypesRepository typesRepository;
//
//    @Autowired
//    TypesRepositoryTest(TypesRepository typesRepository) {
//        this.typesRepository = typesRepository;
//    }
//
//    @Test
//    public void findByNameTest(){
//        String name = "Test Name";
//        TypeIngredient typeIngredient = new TypeIngredient(name);
//        typesRepository.save(typeIngredient);
//        System.out.println(typesRepository.findByName(name).isPresent());
//    }
//
//}