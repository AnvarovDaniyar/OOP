package org.example.HomeWork.hw1;

import java.util.ArrayList;

public interface VendingMachine {
    public ArrayList getDrinkByName(String serchName);
    public ArrayList getDrinkByVolume(Double serchVolume);
    public ArrayList getDrinkByTemperature(Double serchTemperature);
}
