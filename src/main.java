import java.io.IOException;

public class main {
    private static final int COUNT = 10;

    public static void main(String[] args) throws IOException {


        String[] name = new String[COUNT];
        double[] rating  = new double[COUNT];

        System.out.println("Заполняем массивы через консоль");
        class_console.addInfo(name, rating);
        System.out.println("Читаем из массивов на консоль");
        class_console.writeInfo(name, rating);
        System.out.println("Записываем из массивов в файл");
        class_file.writeFile(name, rating);
        System.out.println("Очистим массивы для дальнейшей проверки");
        name = new String[COUNT];
        rating = new double[COUNT];
        System.out.println("Читаем из файла");
        class_file.readFile(name, rating);
        System.out.println("Перечитываем массивы для проверки");
        class_console.writeInfo(name, rating);
    }
}
