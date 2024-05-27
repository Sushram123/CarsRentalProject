package com.example.model;

//Car.java

public class Car {
 private String id;
 private String make;
 private String model;
 private double rentPerDay;

 // Constructors, getters and setters
 public Car(String id, String make, String model, double rentPerDay) {
     this.id = id;
     this.make = make;
     this.model = model;
     this.rentPerDay = rentPerDay;
 }

 public String getId() {
     return id;
 }

 public String getMake() {
     return make;
 }

 public String getModel() {
     return model;
 }

 public double getRentPerDay() {
     return rentPerDay;
 }
}

