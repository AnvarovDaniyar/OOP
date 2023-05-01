package org.example.HomeWork.hw5.BalanceServ;

public class BankService{


    private double balance;

        public void deposit(double sum) {
        balance += sum;
    }

    public void withdraw(double amount) {
        if (balance < amount) {
            System.out.println("Insufficient funds");
        } else {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }

}
