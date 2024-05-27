package com.example.service;


//CarRentalServiceTest.java
import com.example.model.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarRentalServiceTest {

 private CarRentalService carRentalService = new CarRentalService();

 @Test
 void getCarDetails() {
     Car car = carRentalService.getCarDetails("1");
     assertNotNull(car);
     assertEquals("Toyota", car.getMake());
     assertEquals("Camry", car.getModel());
     assertEquals(50, car.getRentPerDay());
 }

 @Test
 void getCarDetails_invalidId() {
     Car car = carRentalService.getCarDetails("invalid");
     assertNull(car);
 }
}
