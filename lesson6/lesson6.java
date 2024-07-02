/* Задание №0
Перепишите следующий код, используя ресурсный try */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.file.Files;
import java.lang.Error;

// package lesson6;

// /**
//  * lesson6
//  */
// public class lesson6 {
// public static void main(String[] args) {
//     try {
//         doSomething();
//     }
//     catch (IOException e) {
//         System.out.println("Исключение ввода-вывода");
//     }
// }
// public void rwLine (Path pathRead, Path pathWrite) throws IOException {
//     try (BufferedReader in = Files.newBufferedReader(pathRead);
//         BufferedWriter out = Files.newBufferedWriter(pathWrite)){
//         out.write(in.readLine());
//     }
// }

/* Задание №1
Создайте метод doSomething(), который может быть источником одного из типов checked exceptions 
(тело самого метода прописывать не обязательно). Вызовите этот метод из main и обработайте в 
нем исключение, которое вызвал метод doSomething() */

// public class lesson6 {
//     public static void main(String[] args) {
//         try {
//             doSomething();
//         }
//         catch (IOException e) {
//             System.out.println("Исключение ввода-вывода");
//         }
//     }        
//     public static void doSomething() throws IOException {
//         throw new IOException();
//     }
// }

/*Задание №2
Создайте класс Счетчик, у которого есть метод add(), увеличивающий значение внутренней 
int переменной на 1. Сделайте так, чтобы с объектом такого типа можно было работать в 
блоке try-with-resources. Подумайте, что должно происходить при закрытии этого ресурса? 
Напишите метод для проверки, закрыт ли ресурс. При попытке вызвать add() у закрытого
ресурса, должен выброситься IOException */

// public class lesson6 {
//     public static void main(String[] args) throws Exception {
//         try (Counter counter = new Counter()){
//             System.out.println(counter);
//             counter.add();
//             System.out.println(counter);
//         }
//         Counter counter = new Counter();
//         System.out.println(counter);
//         counter.add();
//         System.out.println(counter);
//         counter.close();
//         counter.add();
//     }

// }

/* Задание №3
1. Создайте класс исключения, который будет выбрасываться при делении на 0. Исключение должно
отображать понятное для пользователя сообщение об ошибке.
2. Создайте класс исключений, которое будет возникать при обращении к пустому элементу в массиве
ссылочного типа. Исключение должно отображать понятное для пользователя сообщение об ошибке
3. Создайте класс исключения, которое будет возникать при попытке открыть несуществующий файл.
Исключение должно отображать понятное для пользователя сообщение об ошибке. */

// public class lesson6 {

//     public class DivisionByZeroException extends Exception {
//         public DivisionByZeroException() {
//             super("Делить на ноль нельзя!");
//         }
//     }

//     public class NullArrayElementException extends Exception {
//         public NullArrayElementException() {
//             super("Обращение к пустому элементу массива!");
//         }
//     }

//     public class FileNotFoundException extends Exception {
//         public FileNotFoundException() {
//             super("Файл не найден!");
//         }
//     }
// }

/* Задание №4
1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4. При подаче
массива другого размера необходимо бросить исключение MyArraySizeException.
2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или
текст вместо числа), должно быть брошено исключение MyArrayDataException с детализацией, в какой
именно ячейке лежат неверные данные.
3. В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException
и MyArrayDataException и вывести результат расчета (сумму элементов, при условии что подали на вход
корректный массив).*/

public class lesson6 {

    public static void main(String[] args) {
        String[][] array = { { "1", "1", "1", "1" }, { "1", "1", "1", "1" }, { "1", "1", "1", "1" },
                { "1", "1", "1", "1" } };
        try {
            int sum = calculateSum(array);
            System.out.println(sum);
        } catch (MyArrayDataException e){
            System.out.println(e.getMessage());
        } catch (MyArraySizeException e){
            System.out.println(e.getMessage());
        }
    }

    public static int calculateSum(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4 || array[0].length != 4){
            throw new MyArraySizeException();
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверные данные в ячейке [" + i + "][" + j + "]");
                }
            }
        }
        return sum;
    }

    /**
     * MyArraySizeException
     */
    public class MyArraySizeException extends Exception {
        public MyArraySizeException (){
            super("Неверный размер массива, должен быть 4х4!");
        }
    }

    class MyArrayDataException extends Exception {
        public MyArrayDataException(String message) {
            super(message);
        }
    }
}