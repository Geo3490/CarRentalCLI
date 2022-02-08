package com.careerdevs;

public class Car {
    private String make;
    private String model;
    private boolean isRented;

    public Car(String make,String model, boolean isRented){
        this.make = make;
        this.model = model;
        this.isRented = false;

    }

    public String getMake() {

        return make;
    }

    public String getModel() {

        return model;
    }

    public string getName(){
        return make + " " + model;
    }

    public boolean getIsRented() {

        return isRented;
    }
}
