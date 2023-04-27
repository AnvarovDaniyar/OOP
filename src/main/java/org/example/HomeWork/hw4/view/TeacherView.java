package org.example.HomeWork.hw4.view;

import org.example.HomeWork.hw4.data.StudentGroup;
import org.example.HomeWork.hw4.data.Teacher;

import java.util.List;
import java.util.logging.Logger;

public class TeacherView implements UserView<Teacher> {
    Logger logger = Logger.getLogger(TeacherView.class.getName());

    @Override
    public void sendOnConsole(List<Teacher> teachers) {
        for (Teacher user : teachers) {
            logger.info(user.toString());
        }
    }

    public void sendOnConsoleUserGroupTeacher(StudentGroup studentGroup){
        logger.info(studentGroup.toString());
    }
}