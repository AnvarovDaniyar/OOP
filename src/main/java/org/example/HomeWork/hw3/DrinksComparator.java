package org.example.HomeWork.hw3;

import java.util.Comparator;


public class DrinksComparator<Drinks> implements Comparator<Drinkss> {
    private String type;

    public DrinksComparator(String type) {
        this.type = type;
    }

    @Override
    public int compare(Drinkss o1, Drinkss o2) {
        switch (type) {
            case "volume": {
                return o1.getVolume().compareTo(o2.getVolume());
            }
            case "temperature": {
                return o1.getTemperature().compareTo(o2.getTemperature());
            }
        }
        return 0;


    }
}
