package org.example.HomeWork.hw1;

import org.example.Seminar.cw1.Product;

import java.util.ArrayList;

public interface VendingMachine {
    //public ArrayList getDrinkByName(String searchName);
    //public ArrayList getDrinkByVolume(Double searchVolume);
    //public ArrayList getDrinkByTemperature(Double searchTemperature);
    Drink getProducts(String name) throws IllegalStateException;
}
