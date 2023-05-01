package org.example.HomeWork.hw5.service;

import org.example.HomeWork.hw5.model.User;
import org.example.HomeWork.hw5.repo.UserRepo;

public class UserService {
    private UserRepo userRepo = new UserRepo();
    public void saveUser(User user){
        userRepo.saveUser(user);
    }

    public void deleteFromRepo(User user){
        userRepo.deleteFromRepo(user);
    }

    public User getUserFromRepo(User user){return userRepo.getUserFromRepo(user);}

    public void addUserFromRepo(User user){userRepo.addUserToRepo(user);}


}
