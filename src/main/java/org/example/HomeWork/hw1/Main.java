package org.example.HomeWork.hw1;

import java.util.ArrayList;
import java.util.List;

/**
 * 1- Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
 * 2- Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный
 * метод getProduct(int name, int volume, int temperature) выдающий продукт соответствующий имени, объему и температуре
 * В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику заложенную
 * в программе
 * Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
 */
public class Main {


    public static void main(String[] args) {
        List<Drink> list = new ArrayList<>();
        HotDrinksVendingMachine machine = new HotDrinksVendingMachine(list);
        list.add(new HotDrink("coffee", 0.3, 70.0));
        list.add(new HotDrink("milk", 0.5, 43.7));
//        machine.addDrink(new HotDrink("cappuccino", 0.3, 55.5));
//        machine.addDrink(new HotDrink("tea", 0.5, 55.5));

        HotDrink hotDrink = machine.getProducts("coffee", 0.3, 70.0);


        System.out.println(machine.getProducts("coffee", 0.3, 70.0));
    }
}
