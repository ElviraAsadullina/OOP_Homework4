package ru.gb.oopseminar.Homework4;

import ru.gb.oopseminar.Homework4.Model.Student;
import ru.gb.oopseminar.Homework4.Model.Teacher;
import ru.gb.oopseminar.Homework4.Service.UserService;
import ru.gb.oopseminar.Homework4.impls.UserServiceImpl;


public class AddList {

    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.add(new Student("Roman", 4.92f, 4, new Teacher("Антонина Петровна")));
        userService.add(new Student("Andrew", 4.52f, 1, new Teacher("Валентина Петровна")));
        userService.add(new Student("Nicolas", 3.2f, 1, new Teacher("Анастасия")));
        userService.add(new Student("Jeffrey", 5.00f, 2, new Teacher("Павел Иванович")));
        userService.add(new Student("Angela", 3.11f, 3, new Teacher("Петр Павел")));
        userService.add(new Student("Rose", 2.92f, 3, new Teacher("Антон")));
        userService.add(new Student("Jenny", 3.94f, 4, new Teacher("Крис")));
        userService.add(new Teacher("Bella"));
    }
}
