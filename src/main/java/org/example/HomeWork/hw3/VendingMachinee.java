package org.example.HomeWork.hw3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class VendingMachinee {
    private List<Drinkss> drinkss = new ArrayList<>();

    public VendingMachinee() {
    }

    public void addDrinkss(Drinkss drinkss) {
        this.drinkss.add(drinkss);
    }

    public void print() {
        Iterator var1 = this.drinkss.iterator();

        while (var1.hasNext()) {
            Drinkss drinkss = (Drinkss) var1.next();
            System.out.println(drinkss);
        }
    }

    public List<Drinkss> getDrinkss() {
        return this.drinkss;
    }

    public void sort(DrinksComparator comparator) {
        Collections.sort(this.drinkss, comparator);
    }
}
