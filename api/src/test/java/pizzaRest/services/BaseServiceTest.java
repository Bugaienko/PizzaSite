//package pizzaRest.services;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.springframework.data.domain.Sort;
//import pizzaRest.models.Base;
//import pizzaRest.repositiries.BaseRepository;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@ExtendWith(MockitoExtension.class)
//class BaseServiceTest {
//
//    @Mock
//    private BaseRepository baseRepository;
//
//    @InjectMocks
//    private BaseService baseService;
//
//    private static List<Base> bases;
//
////    @BeforeEach
////    public void setup(){
////        baseRepository = Mockito.mock(BaseRepository.class);
////        baseService = new BaseService(baseRepository);
////    }
//
//    @BeforeAll
//    public static void setup(){
//        bases = getBases();
//    }
//
//    @Test
//    public void findAllSortedTest(){
//
//        Mockito.when(baseRepository.findAll(Sort.by("size").and(Sort.by("name")))).thenReturn(bases);
//
//        List<Base> baseList = baseService.findAllSorted();
//
//        Assertions.assertNotNull(baseList);
//        Assertions.assertEquals(3, baseList.size());
//
//    }
//
//
//    private static List<Base> getBases() {
//        List<Base> bases = new ArrayList<>();
//        Base base1 = new Base("Small", "Thin crust", 4.0);
//        base1.setId(1);
//        Base base2 = new Base("Medium", "Thin crust", 4.50);
//        base2.setId(2);
//        Base base3 = new Base("Large", "Thin crust", 5);
//        base3.setId(3);
//        bases.add(base1);
//        bases.add(base2);
//        bases.add(base3);
//
//        return bases;
//    }
//
//}