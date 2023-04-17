package org.example.HomeWork.hw1;

import org.example.Seminar.cw1.BottleOfWater;
import org.example.Seminar.cw1.Product;

import java.util.ArrayList;
import java.util.List;

public class HotDrinksVendingMachine implements VendingMachine {
    private ArrayList<HotDrink> list;
    private List<Drink> list2;


    public HotDrinksVendingMachine(ArrayList<HotDrink> list) {
        this.list = list;
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



 public HotDrinksVendingMachine() {
        list = new ArrayList<HotDrink>();
    }

    public void addDrink(HotDrink newDrink) {
        list.add(newDrink);
    }

    public ArrayList getDrinkByName(String searchName) {
        ArrayList<HotDrink> result = new ArrayList<>();
        for (HotDrink item : list) {
            if (item.getName().contains(searchName)) {
                result.add(item);
            }
        }
        return result;
    }

    public ArrayList getDrinkByVolume(Double searchVolume) {
        ArrayList<HotDrink> result = new ArrayList<>();
        for (HotDrink item : list) {
            if (item.getVolume().equals(searchVolume)) {
                result.add(item);
            }
        }
        return result;
    }

    public ArrayList getDrinkByTemperature(Double searchTemperature) {
        ArrayList<HotDrink> result = new ArrayList<>();
        for (HotDrink item : list) {
            if (item.getTemperature().equals(searchTemperature)) {
                result.add(item);
            }
        }
        return result;
    }


}
