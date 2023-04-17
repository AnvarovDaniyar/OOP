package org.example.HomeWork.hw1;

import org.example.Seminar.cw1.BottleOfWater;
import org.example.Seminar.cw1.Product;

import java.util.ArrayList;
import java.util.List;

public class HotDrinksVendingMachine implements VendingMachine {
//    private ArrayList<HotDrink> list;
    private final List<Drink> list2;

    public void addDrink(HotDrink newDrink) {
        list2.add(newDrink);
    }


    public HotDrinksVendingMachine(List<Drink> list2) {
        this.list2 = list2;
    }



    public Drink getProducts(String name) {
        for (Drink item : list2) {
            if (item.getName().equalsIgnoreCase(name)) {
                return item;
            }
        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }


    public HotDrink getProducts(String name, Double volume, Double temperature) {
        for (Drink item : list2) {
            if (item instanceof HotDrink) {
                if (item.getName().equalsIgnoreCase(name) && ((HotDrink) item).getVolume() == volume
                && ((HotDrink)item).getTemperature() == temperature) {
                    return (HotDrink) item;
                }
            }

        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }
}
