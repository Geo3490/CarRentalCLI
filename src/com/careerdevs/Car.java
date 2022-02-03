package com.careerdevs;

public class Car {
    public String make;
    public String model;
    public boolean isRented;

    public Car(String make,String model, boolean isRented){
    this.make = make;
    this.model = model;
    this.isRented = isRented;

    }

    public String getMake() {

        return make;
    }

    public String getModel() {

        return model;
    }

    public boolean isRented() {

        return isRented;
    }
}
