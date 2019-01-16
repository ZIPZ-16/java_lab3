import java.util.Scanner;

class class_console {
    static void addInfo(String[] name, double[] rating) {
        for (int i = 0; i < name.length; i++) {
            Scanner in = new Scanner(System.in);
            System.out.print("Имя : ");
            name[i] = in.next();
            System.out.print("Средний бал : ");
            rating[i] = in.nextDouble();
            in.reset();
            System.out.println("Студент добавлен");
        }
    }

    static void writeInfo(String[] name, double[] rating) {
        String format = "%-40s%s%n";
        for (int i = 0; i < name.length; i++) {

            System.out.printf(format, name[i], rating[i]);
        }
    }
}
