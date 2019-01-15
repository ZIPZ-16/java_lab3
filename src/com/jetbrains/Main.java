package com.jetbrains;

public class Main {

    // кол. студентов
    public static final int COUNT = 10;

    public static void main(String[] args) {
        Student[] students = new Student[COUNT];
        CConsole.addStudents(students);
        CConsole.printAll(students);
    }
}
