package org.example.HomeWork.hw5.controller;

import org.example.HomeWork.hw5.model.User;
import org.example.HomeWork.hw5.service.UserService;

public class UserController {
    private UserService userService = new UserService();
    public void saveNewUser(Integer userID, String name, int age, Double balance){
        userService.saveUser(new User(userID,name,age,balance));
    }
    public void deleteUser(User user){
        userService.deleteFromRepo(user);
    }

    public User getUser(User user){
        return userService.getUserFromRepo(user);
    }

    public void addUserFromRepo(User user){
        userService.addUserFromRepo(user);
    }

    public void addUserToRepo(User user1) {
        userService.addUserFromRepo(user1);
    }
}
