package org.example.HomeWork.hw1;

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
}
