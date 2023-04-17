package org.example.Seminar.cw1;

public interface VendingMachine {
    Product getProduct(String name) throws IllegalStateException;
}
