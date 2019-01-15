package com.jetbrains;
import java.util.Scanner;

public class CConsole
{
    public static void addStudents(Student[] students)
    {

        for(int i=0; i<Main.COUNT; i++)
        {
            students[i] = new Student();
//            PRODUCTION
            Scanner in = new Scanner(System.in);
            System.out.print("Input name " + i + " : ");
            students[i].setName(in.nextLine());
            System.out.print("Input rating: ");
            students[i].setRating(in.nextDouble());
            in.reset();

//            DEBUG
//            students[i].setName("Name" + i);
//            students[i].setRating(5);
        }
    }

    public static void printAll(Student[] students)
    {
        if(students.length > 0 && students[0] != null)
        {
            for(int i=0; i<Main.COUNT; i++)
            {
                System.out.println(students[i].getName() + " : " + students[i].getRating());
            }
            return;
        }
        System.out.println("List is empty...");
    }
}
