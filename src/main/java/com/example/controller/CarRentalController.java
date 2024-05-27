package com.example.controller;

//CarRentalController.java
import com.example.service.*;
import com.example.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cars")
public class CarRentalController {

 @Autowired
 private CarRentalService carRentalService;
 
 @GetMapping("/{carId}")
 public ResponseEntity<Car> getCarDetails(@PathVariable String carId) {
     Car car = carRentalService.getCarDetails(carId);
     return new ResponseEntity<>(car, HttpStatus.OK);
 }

// @GetMapping("/{carId}")
// public Car getCarDetails(@PathVariable String carId) {
//     return carRentalService.getCarDetails(carId);
// }
}

