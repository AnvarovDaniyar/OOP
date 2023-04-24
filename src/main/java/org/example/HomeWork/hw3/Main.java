package org.example.HomeWork.hw3;

public class Main {
    public static void main(String[] args) {
        VendingMachinee machinee = new VendingMachinee();
        machinee.addDrinkss(new Drinkss("coffee", 0.3, 70.0));
        machinee.addDrinkss(new Drinkss("milk", 0.7, 43.7));
        machinee.addDrinkss(new Drinkss("cappuccino", 0.3, 55.5));
        machinee.addDrinkss(new Drinkss("tea", 0.5, 55.5));


        machinee.sort(new DrinksComparator("temperature"));
        machinee.print();
        System.out.println("****");
        machinee.sort(new DrinksComparator("volume"));
        machinee.print();


    }


}
