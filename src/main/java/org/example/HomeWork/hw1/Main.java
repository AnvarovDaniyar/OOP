package org.example.HomeWork.hw1;
/**
 * 1- Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
 * 2- Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный
 * метод getProduct(int name, int volume, int temperature) выдающий продукт соответствующий имени, объему и температуре
 * 3- В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику заложенную
 * в программе
 * 4- Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
 */
public class Main {
    public static void main(String[] args) {
        HotDrinksVendingMachine machine = new HotDrinksVendingMachine();
        machine.addDrink(new HotDrink("coffe", 0.3, 70.0));
        machine.addDrink(new HotDrink("milk", 0.5, 43.7));
        machine.addDrink(new HotDrink("cappuccino", 0.3, 55.5));
        machine.addDrink(new HotDrink("tea", 0.5, 55.5));

        System.out.println(machine.getDrinkByName("tea"));
        System.out.println(machine.getDrinkByVolume(0.3));
        System.out.println(machine.getDrinkByTemperature(43.7));
    }
}
