package com.careerdevs;

import java.util.ArrayList;
import java.util.List;

public class RentalService {

    private static ArrayList<Car> carStorage;

    public static void main(String[] args) {

//int testInt = UI.readInt("Enter a num", 1, 10);
//
//        System.out.println(testInt);

    }

    private static void initializeCarStorage(){
        carStorage = new ArrayList<>();

        Car car1 = new Car("Honda", "Accord",false);
        Car car2 = new Car("Chevy", "Tahoe",false);
        Car car3 = new Car("Ford", "F150",false);

        carStorage.addAll(List.of(new Car[]{car1, car2, car3}));

    }
}
