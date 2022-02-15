package com.careerdevs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//Rental service holds all MENUS as well as USER LOGIC
public class RentalService {

    private static ArrayList<Car> carStorage;

    public static void main(String[] args) {

    initializeCarStorage();

//    carStorage.get(0).setRented(true);//FOR TESTING
//        carStorage.get(3).setRented(true);//FOR TESTING

        mainMenu();
        rentalMenu();
        rentalMenu();

    }

    public static void mainMenu (){
        System.out.println("-".repeat(15) + "\nMAIN MENU\n" + "-".repeat(15));
        int selection = UI.readInt("Would you like to:\n1)rent\n2)return\n3)exit",1,3);
        if (selection == 1){
            rentalMenu();
        }
        else if(selection == 2){
            returnMenu();
        }
        else {
            return;
        }
    }

    private static ArrayList<Car> filteredCars (boolean filterRented) {
        //Create Temp Array for just the available cars
        ArrayList<Car> filteredCars = new ArrayList<>();
        for (int i = 0; i < carStorage.size(); i++) {
            boolean keepCar = carStorage.get(i).isRented();
            //Flipping the value of a boolean with !keepCar = no, not available || keepCar = yes, get the vehicle
            if (filterRented) keepCar = !keepCar;
            if (keepCar) {
                filteredCars.add(carStorage.get(i));

            }
        }
            return filteredCars;
    }

    //This Approach is the shorter easier way to do the same code block as above.
    private static ArrayList<Car> getAvailableCars (){

        // Take Array List turning it to stream to modify / filter elements within array.
        return carStorage.stream().filter(car -> !car.isRented()).collect(Collectors.toCollection(ArrayList::new));

    }

        private static void rentalMenu() {
            ArrayList<Car> availableCars = getAvailableCars();

        //Display available cars
        System.out.println("\nAVAILABLE CARS\n");
        for (int i = 0; i < availableCars.size(); i++){
            System.out.println(i+1 + ") " + availableCars.get(i).getName());
        }

        //read User Input
        int userSelection = UI.readInt("Enter a number to select car to rent", 1, availableCars.size());


        //inform the user of a successful rent
        System.out.println("You are renting" + " " + availableCars.get(userSelection-1).getName());

//            System.out.println("You are returning" + " " + availableCars.get(userSelection-1).getName());

        //updating the car rental status
        availableCars.get(userSelection-1).setRented(true);
    }

    private static void returnMenu(){
        ArrayList<Car> availableCars = filteredCars(false);
        System.out.println("\nAVAILABLE RENTED CARS\n");
        int listNumber = 1;
        for (int i = 0; i < carStorage.size(); i++){
            if (carStorage.get(i).isRented()){
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
//        System.out.println("\nAVAILABLE CARS\n");
//        int listNumber = 1;
//        for (int i = 0; i < carStorage.size(); i++){
//            if (!carStorage.get(i).isRented()){
//                System.out.println(listNumber + ") " + carStorage.get(i).getName());
//                listNumber++;
//            }
//        }
//
//
//        int userSelection = UI.readInt("Enter a number to select car to rent", 1, carStorage.size() + 1);
//
//        // Update uS to account for rented cars
//        System.out.println(carStorage.get(userSelection-1).getName());
