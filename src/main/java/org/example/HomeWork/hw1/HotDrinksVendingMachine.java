package org.example.HomeWork.hw1;

import java.util.ArrayList;

public class HotDrinksVendingMachine {
    private ArrayList<HotDrink> list;


    public HotDrinksVendingMachine(){
        list = new ArrayList<HotDrink>();
    }

    public void addDrink(HotDrink newDrink) {
        list.add(newDrink);
    }

    public ArrayList getDrinkByName(String serchName) {
        ArrayList<HotDrink> result = new ArrayList<>();
        for (HotDrink item : list) {
            if (item.getName().contains(serchName)) {
                result.add(item);
            }
        }
        return result;
    }
    public ArrayList getDrinkByVolume(Double serchVolume) {
        ArrayList<HotDrink> result = new ArrayList<>();
        for (HotDrink item : list) {
            if (item.getVolume().equals(serchVolume)) {
                result.add(item);
            }
        }
        return result;
    }
    public ArrayList getDrinkByTemperature(Double serchTemperature) {
        ArrayList<HotDrink> result = new ArrayList<>();
        for (HotDrink item : list) {
            if (item.getTemperature().equals(serchTemperature)) {
                result.add(item);
            }
        }
        return result;
    }

}
