package org.example.HomeWork.hw2;

import java.util.HashSet;
import java.util.Set;

public class main {
    public static void main(String[] args) {
        Set<Laptops> set = new HashSet<>();
        set.add(new Laptops("Asus", 8, 512, "DOS", "grey"));
        set.add(new Laptops("Lenovo", 32, 512, "Windows 11", "black"));
        set.add(new Laptops("Apple", 64, 1000, "IOS", "pink"));
        set.add(new Laptops("HP", 16, 256, "Windows 11", "silver"));

        OperationWithNotebook operation = new OperationWithNotebook(set);
        operation.start();
        System.out.println(set);

    }
}
