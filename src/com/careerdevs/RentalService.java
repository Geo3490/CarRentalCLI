package com.careerdevs;

import java.util.ArrayList;
import java.util.List;

public class RentalService {

    private static ArrayList<Car> carStorage;

    public static void main(String[] args) {

//  int testInt = UI.readInt("Enter a num", 1, 10);

//        System.out.println(testInt);

    initializeCarStorage();
    carStorage.get(1).setRented(true);//FOR TESTING
        rentalMenu();
    }

    private static void rentalMenu(){
        System.out.println("\nAVAILABLE CARS\n");
        int listNumber = 1;
        for (int i = 0; i < carStorage.size(); i++){
            if (!carStorage.get(i).isRented()){
                System.out.println(listNumber + ") " + carStorage.get(i).getName());
                listNumber++;
            }
        }
    }

    private static void initializeCarStorage(){
        carStorage = new ArrayList<>();

        Car car1 = new Car("Honda", "Accord",false);

        Car car2 = new Car("Chevy", "Tahoe",false);

        Car car3 = new Car("Ford", "F150",false);

        carStorage.addAll(List.of(new Car[]{car1, car2, car3}));

    }
}
