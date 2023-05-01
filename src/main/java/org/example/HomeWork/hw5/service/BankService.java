package org.example.HomeWork.hw5.service;

public class BankService{


    private double balance;

//    public BankService(double balance) {
//        this.balance = balance;
//    }

    public void deposit(double sum) {
        balance += sum;
    }

    public void withdraw(double sum) {
        if (balance < sum) {
            System.out.println("Insufficient funds");
        } else {
            balance -= sum;
        }
    }

    public double getBalance() {
        return balance;
    }

}
