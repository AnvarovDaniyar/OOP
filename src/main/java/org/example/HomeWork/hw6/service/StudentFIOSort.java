package org.example.HomeWork.hw6.service;
/**
 * Принцип единой ответственности
 */
public class StudentFIOSort {

    public List<Student> sort(List<Student> students) {
        List<Student> sortedStudents = new ArrayList<>(students);
        sortedStudents.sort(new FIOComparator());
        return sortedStudents;
    }

    private static class FIOComparator implements Comparator<Student> {

        @Override
        public int compare(Student s1, Student s2) {
            int result = s1.getSecondName().compareToIgnoreCase(s2.getSecondName());
            if (result == 0) {
                result = s1.getFirstName().compareToIgnoreCase(s2.getFirstName());
                if (result == 0) {
                    result = s1.getMiddleName().compareToIgnoreCase(s2.getMiddleName());
                }
            }
            return result;
        }
    }
}

