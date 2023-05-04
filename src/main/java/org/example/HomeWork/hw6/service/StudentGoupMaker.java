package org.example.HomeWork.hw6.service;

import org.example.HomeWork.hw6.data.Student;
import org.example.HomeWork.hw6.data.StudentGroup;
import org.example.HomeWork.hw6.data.Teacher;

import java.util.List;

/**
 * Принцип единой ответственности
 */
public class StudentGoupMaker {
    private StudentGroup studentGroup;

    public void StudentGoupMaker(Teacher teacher, List<Student> students) {
        this.studentGroup = new StudentGroup(teacher, students);
    }
}
