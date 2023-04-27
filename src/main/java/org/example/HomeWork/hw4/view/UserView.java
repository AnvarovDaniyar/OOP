package org.example.HomeWork.hw4.view;

import org.example.HomeWork.hw4.data.User;

import java.util.List;

public interface UserView<T extends User>{
    void sendOnConsole(List<T> list);
}
