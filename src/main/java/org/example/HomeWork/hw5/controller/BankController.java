package org.example.HomeWork.hw5.controller;

import org.example.HomeWork.hw5.service.BankService;
import org.example.HomeWork.hw5.model.User;

public class BankController {
    private BankService bankService = new BankService();
    public void deposit(Double sum) {
        bankService.deposit(sum);
    }
    public void withdraw(Double sum){
        bankService.withdraw(sum);
    }
    public double getBalance(User user) {
       return bankService.getBalance();
    }
}
