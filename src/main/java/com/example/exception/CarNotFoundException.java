package com.example.exception;

//CarNotFoundException.java

public class CarNotFoundException extends RuntimeException {


public CarNotFoundException(String carId) {
     super("Car with ID " + carId + " not found");
 }
}
