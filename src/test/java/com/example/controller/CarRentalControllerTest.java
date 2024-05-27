package com.example.controller;

//CarRentalControllerTest.java
import com.example.model.*;
import com.example.service.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(CarRentalController.class)
class CarRentalControllerTest {

 @Autowired
 private MockMvc mockMvc;

 @MockBean
 private CarRentalService carRentalService;

 @Test
 void getCarDetails() throws Exception {
     Car car = new Car("1", "Toyota", "Camry", 50);
     when(carRentalService.getCarDetails("1")).thenReturn(car);

     mockMvc.perform(get("/api/cars/1"))
             .andExpect(status().isOk())
             .andExpect(jsonPath("$.make").value("Toyota"))
             .andExpect(jsonPath("$.model").value("Camry"))
             .andExpect(jsonPath("$.rentPerDay").value(50));
 }

 @Test
 void getCarDetails_invalidId() throws Exception {
     when(carRentalService.getCarDetails("invalid")).thenReturn(null);

     mockMvc.perform(get("/api/cars/invalid"))
             .andExpect(status().isNotFound());
 }
}

