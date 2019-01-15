package com.jetbrains;

public class Main {

    // кол. студентов
    public static final int COUNT = 10;

    public static void main(String[] args) {
        Student[] students = new Student[COUNT];

        // Добавить студентов из консоли (PRODUCTION) / отладка (DEBUG)
        CConsole.addStudents(students);

        // вывести всех студентов в консоль
        CConsole.printAll(students);

        // запись всех студентов в файл
        CFile.writeToFile(students);
    }
}
