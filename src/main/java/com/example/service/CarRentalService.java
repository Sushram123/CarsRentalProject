package com.example.service;

//CarRentalService.java

import com.example.exception.*;
import com.example.model.*;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CarRentalService {
 private Map<String, Car> carInventory = new HashMap<>();

 public CarRentalService() {
     // Initialize some cars in the inventory
     carInventory.put("1", new Car("1", "Toyota", "Camry", 50));
     carInventory.put("2", new Car("2", "Honda", "Civic", 45));
     carInventory.put("3", new Car("3", "Ford", "Mustang", 80));
 }

 public Car getCarDetails(String carId) {
	 Car car = carInventory.get(carId);
     if (car == null) {
         throw new CarNotFoundException(carId);
     }
     return car;
    
 }
}
