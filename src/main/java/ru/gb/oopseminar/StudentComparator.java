package ru.gb.oopseminar;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Float.compare(s1.getGrade(), s2.getGrade());
    }
}