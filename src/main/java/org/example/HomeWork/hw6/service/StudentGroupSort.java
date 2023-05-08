package org.example.HomeWork.hw6.service;
/**
 * Принцип единой ответственности
 */
public class StudentGroupSort {
    private StudentGroup studentGroup;

//    public StudentGroupService(StudentGroup studentGroup) {
//        this.studentGroup = studentGroup;
//    }

    public List<Student> getSortedStudentGroup() {
        List<Student> students = new ArrayList<>(studentGroup.getStudents());
        Collections.sort(students);
        return students;
    }
}






