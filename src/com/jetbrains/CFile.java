package com.jetbrains;

import java.io.FileWriter;
import java.io.IOException;

public class CFile {
    public static void writeToFile(Student[] students)
    {
        try(FileWriter writer = new FileWriter("students.txt", false))
        {

        }
        catch(IOException ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    public static void readFromFile()
    {

    }
}
