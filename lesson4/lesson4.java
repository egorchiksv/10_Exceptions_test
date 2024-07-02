/*
Задание №1
Посмотрите на этот код. Все ли с ним хорошо? Если нет, то скорректируйте его и
обоснуйте свое решение.
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class lesson4 {

    // public static void main(String[] args) {
    // Scanner scanner = new Scanner(System.in);
    // int[] arr = new int[10];
    // System.out.println("Укажите индекс элемента массива, в который хотите
    // записать значение 1");
    // int index = 0;
    // if (scanner.hasNextInt()) {
    // index = scanner.nextInt();
    // }
    // else {
    // System.out.println("Укажите индекс элемента массива - целое число!");
    // }
    // if (index > arr.length) {
    // System.out.println("Указан индекс за пределами массива");
    // } else {
    // arr[index] = 1;
    // }
    // System.out.println(Arrays.toString(arr));
    // }
    // }

    /*
     * Задание №2
     * Обработайте возможные исключительные ситуации. “Битые” значения в
     * исходном массиве считайте нулями. Можно внести в код правки, которые считаете
     * необходимыми.
     */

    // public static void main(String[] args) {
    // String[][] arr = { { "1", "1", "1", "1", "1", "1" }, { "1", "1", "1", "1",
    // "1", "a" },
    // { "1", "1", "1", "1", "1", "1" } };
    // System.out.println(sum2d(arr));
    // }

    // public static int sum2d(String[][] arr) {
    // int sum = 0;
    // if (arr != null) {
    // for (int i = 0; i < arr.length; i++) {
    // for (int j = 0; j < arr[0].length; j++) {
    // int val = tryParseInt(arr[i][j]);
    // sum += val;
    // }
    // }
    // }
    // return sum;
    // }

    // public static int tryParseInt(String a) {
    // try{
    // return Integer.parseInt(a);
    // }
    // catch (NumberFormatException e){
    // return 0;
    // }

    // }

    /*
     * Задание №3
     * Запишите в файл следующие строки:
     * Анна=4
     * Елена=5
     * Марина=6
     * Владимир=?
     * Константин=?
     * Иван=4
     * Реализуйте метод, который считывает данные из файла и сохраняет в двумерный
     * массив (либо HashMap).
     * В отдельном методе нужно будет пройти по структуре данных.
     * Если сохранено значение ?, заменить его на соответствующее число.
     * Если на каком-то месте встречается символ, отличный от числа или ?, бросить
     * подходящее исключение.
     * Записать в тот же файл данные с замененными символами ?.
     */

    // public static void main(String[] args) {
    //     HashMap<String, Integer> map = readData("D:\\GeekBrains\\10_Exceptions_test\\lesson4\\lesson4.txt");
    //     writeData("D:\\GeekBrains\\10_Exceptions_test\\lesson4\\lesson4.txt", map);
    // }

    // public static void writeData(String FileName, HashMap<String, Integer> map ) {
    //     try {
    //         File file = new File(FileName);
    //         FileWriter writer = new FileWriter(file);

    //         for (String name: map.keySet()) {
    //             int value = map.get(name);
    //             writer.write(name + "=" + value + "\n");
    //         }
    //         writer.close();
    //     } 
    //     catch (IOException e) {
    //         System.out.println("Ошибка записи!");
    //     }
    // }

    // public static HashMap<String, Integer> readData(String Filename) {
    //     HashMap<String, Integer> map = new HashMap<String, Integer>();
    //     try {
    //         File file = new File(Filename);
    //         Scanner scanner = new Scanner(file);
    //         while (scanner.hasNextLine()) {
    //             String line = scanner.nextLine();
    //             String[] parts = line.split("=");
    //             if (parts.length != 2) {
    //                 throw new IllegalArgumentException("Неверные данные в строке:" + line);
    //             }
    //             String name = parts[0];
    //             String value = parts[1];
    //             int valueint = 0;
    //             if (value.equals("?")) {
    //                 valueint = parts[0].length();
    //             }
    //             else {
    //                 try {
    //                     valueint = Integer.parseInt(value);
    //                 }
    //                 catch (NumberFormatException e){
    //                     throw new IllegalArgumentException("Неверный формат числа!" + line, e);
    //                 }
    //             }
    //             map.put(name, valueint);
    //         }
    //         scanner.close();
    //     } 
    //     catch (FileNotFoundException e) {
    //         System.out.println("Файл не найден!");
    //     }
    //     return map;
    // }

/* Задание №4
Дан следующий код:
Исправьте код, примените
подходящие способы
обработки исключений.*/
    public static void main(String[] args) {
        InputStream inputStream;
        try {
            String[] strings = {"asdf", "asdf"};
            String strings1 = strings[strings.length - 1];
            test();
            int a = 1 / 0;
            inputStream = new FileInputStream("sdafgsaf");
        } catch (StackOverflowError error) {
            System.out.println("Стек переполнен");
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            System.out.println("Я все равно выполнился!");
        }
        System.out.println("Я жив!");
    }

    public static void test() throws IOException {
        File file = new File("1");
        file.createNewFile();
        FileReader reader = new FileReader(file);
        reader.read();
        test();
    }
        
    
}