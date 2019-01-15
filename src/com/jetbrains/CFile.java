package com.jetbrains;

import java.io.FileWriter;
import java.io.IOException;

public class CFile {
    public static void writeToFile(Student[] students)
    {
        try(FileWriter writer = new FileWriter("students.txt", false))
        {
            for(int i=0; i<Main.COUNT; i++)
            {
                writer.write(students[i].getName() + ": " + students[i].getRating() + "\n");
            }

            System.out.println("=Write to file success! (students.txt)=");

        }
        catch(IOException ex)
        {
            System.out.println(ex.getMessage());
            System.out.println("Write to file failed :(");
        }
    }

    public static void readFromFile()
    {

    }
}
