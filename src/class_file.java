import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

class class_file {

    static void writeFile(String[] name, double[] rating) throws IOException {
        String filename = "file.txt";
        BufferedWriter outputWriter = null;
        outputWriter = new BufferedWriter(new FileWriter(filename));
        for (int i = 0; i < name.length; i++) {
            outputWriter.write(name[i]+"|" + Double.toString(rating[i]));
            outputWriter.newLine();
        }
        outputWriter.flush();
        outputWriter.close();
    }

    static void readFile(String[] name, double[] rating) throws IOException {
        File file = new File("file.txt");
        Scanner input = new Scanner(file);

        int i = 0;
        while (input.hasNextLine()) {
            String line = input.nextLine();
            System.out.println(line);

            String[] arr = line.split(Pattern.quote("|"));

            name[i] = arr[0];
            rating[i] = Double.parseDouble(arr[1]);

            i++;
        }
    }
}
