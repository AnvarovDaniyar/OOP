package org.example.HomeWork.hw1;


public abstract class Drink {
    private String name;
    private Double volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public Drink(String name, Double volume) {
        this.name = name;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "" + name + " volume=" + volume;
    }
}
