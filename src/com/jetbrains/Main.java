package com.jetbrains;

public class Main {

    // кол. студентов
    public static final int COUNT = 10;
    public static final String FILENAME = "students.txt";

    public static void main(String[] args) {
        Student[] students = new Student[COUNT];

        // Добавить студентов руками (PRODUCTION) / авто (DEBUG)
        CConsole.addStudents(students);

        // вывести всех студентов в консоль
        CConsole.printAll(students);

        // запись всех студентов в файл
//        CFile.writeToFile(students);

        // очищаем массив студентов
//        clearStudents(students);

        // чтение из файла и запись в массив обьектов
        CFile.readFromFile(students);

        // и выводим уже считанные из файла
        CConsole.printAll(students);


        //
    }

    public static void clearStudents(Student[] students)
    {
        for(int i=0; i<COUNT; i++)
        {
            students[i] = null;
        }
    }
}
