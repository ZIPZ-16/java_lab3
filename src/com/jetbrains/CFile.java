package com.jetbrains;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CFile {
    public static void writeToFile(Student[] students)
    {
        try(FileWriter writer = new FileWriter(Main.FILENAME, false))
        {
            for(int i=0; i<Main.COUNT; i++)
            {
                writer.write(students[i].getName() + ":" + students[i].getRating() + "\n");
            }

            System.out.println("=Write to file success! (students.txt)=");

        }
        catch(IOException ex)
        {
            System.out.println(ex.getMessage());
            System.out.println("Write to file failed :(");
        }
    }

    public static void readFromFile(Student[] students)
    {
        try(FileReader reader = new FileReader(Main.FILENAME))
        {
            System.out.println("Read from  " + Main.FILENAME);
            int c, size = 10;
            int buff1_count = 0, buff2_count = 0, count = 0;
            char[] buff_name = new char[size];
            char[] buff_rating = new char[size];
            while( (c=reader.read()) != -1 ) // конец файла
            {
                while( c != 58) { // двоеточие
                    buff_name[buff1_count++] = ( (char)c) ;
                    c = reader.read();
                }
                while( ((c = reader.read()) != 10)) // конец строки
                {
                    if(c != 32 && c != 58 && c != 10)
                    {
                        buff_rating[buff2_count++] = ( (char)c);
                    }
                }
                students[count].setName(String.valueOf(buff_name));
                students[count].setRating(Double.valueOf(String.valueOf(buff_rating)));
//                System.out.println(students[count].getName());
//                System.out.println(students[count].getRating());
                count++;
                buff1_count = buff2_count = 0;
                clearBuff(buff_name, size);
                clearBuff(buff_rating, size);

            }
        }
        catch(IOException ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    public static void clearBuff(char[] buff, int size)
    {
        for(int i=0; i < size; i++)
        {
            buff[i] = '\0';
        }
    }
}
