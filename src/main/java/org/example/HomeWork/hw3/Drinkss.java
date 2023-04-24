package org.example.HomeWork.hw3;

public class Drinkss {
    private String name;
    private Double volume;
    private Double temperature;

    public Drinkss(String name, Double volume, Double temperature) {
        this.name = name;
        this.volume = volume;
        this.temperature = temperature;
    }

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

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return  name + ' ' +
                ", volume=" + volume +
                ", temperature=" + temperature;
    }
}
