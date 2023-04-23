package pizzaRest.controllers.rest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import pizzaRest.dto.CafeDTO;
import pizzaRest.models.Cafe;
import pizzaRest.services.CafeService;
import pizzaRest.services.PizzaService;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class CafeRestControllerTest {


    @Mock
    ModelMapper modelMapper;

    @Mock
    CafeService cafeService;

    @Mock
    PizzaService pizzaService;

    @InjectMocks
    CafeRestController controller;

    private CafeDTO convertCafeToDTO(Cafe cafe) {
        System.out.println(modelMapper.map(cafe, CafeDTO.class));
        return modelMapper.map(cafe, CafeDTO.class);
    }

    @Test
    void handleGetAllCafes_ReturnsValidResponseEntity() {
        //given
        var cafes = Arrays.asList(
                new Cafe("first", "Address1", "email1@mail.com", "+49-151-222-333-44", "8:00", "20:00"),
                new Cafe("Second", "Address2", "email2@mail.com", "+49-151-555-666-77", "9:00", "21:00"));
//        doReturn(cafes).
        Mockito.when(this.cafeService.findAll()).thenReturn(cafes);

        //when
        var responseEntity = this.controller.getAllCafes();
        System.out.println(responseEntity.getHeaders());
        System.out.println(responseEntity.getBody());

        //then
        assertNotNull(responseEntity);
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
//        assertEquals("application/json", responseEntity.getHeaders().getContentType());
//        assertEquals(cafes.stream().map(this::convertCafeToDTO).collect(Collectors.toList()), responseEntity.getBody());
//        assertEquals(cafes, responseEntity.getBody());


    }

}