package org.example.HomeWork.hw1;

import org.example.Seminar.cw1.BottleOfWater;

public class HotDrink extends Drink{
    private Double temperature;
    public HotDrink(String name, Double volume) {
        super(name, volume);
    }

    public HotDrink(String name, Double volume, Double temperature) {
        super(name, volume);
        this.temperature = temperature;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BottleOfWater)) {
            return false;
        }

        HotDrink that = (HotDrink) o;

        return super.getName().equalsIgnoreCase(that.getName())
                && super.getVolume() == that.getVolume()
                && getTemperature() == that.getTemperature();
    }
}
