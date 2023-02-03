package ru.gb.oopseminar.Homework4;

import ru.gb.oopseminar.Homework4.Model.Student;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    public float compareByGrade(Student o1, Student o2) {
        return Float.compare(o1.getGrade(), o2.getGrade());
    }
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getYear(), o2.getYear());
    }
}
