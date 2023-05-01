package org.example.HomeWork.hw5.view;

import org.example.HomeWork.hw5.controller.UserController;
import org.example.HomeWork.hw5.model.User;

import java.util.Scanner;

public class UserView {


    public static void main(String[] args) {
        UserController userController = new UserController();
        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter ur data");
//        userController.saveNewUser(scanner.nextInt(), scanner.next(), scanner.nextInt(), scanner.nextDouble());
        User user1 = new User(3, "name_3", 38, 1000.0);
        userController.addUserToRepo(user1);
        System.out.println(userController.getUser(user1));
        userController.deleteUser(user1);
        System.out.println(userController.getUser(user1));
    }
}