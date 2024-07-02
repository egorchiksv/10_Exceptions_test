package lesson4_HW;
import java.util.Arrays;
/*Напишите программу, которая проверяет, является ли введенная текстовая строка числом с плавающей точкой (float).
Программа пытается преобразовать введенную строку в число float, и если это успешно, она выводит полученное число.
Если преобразование не удалось, программа выдаёт сообщение об ошибке
Your input is not a float number. Please, try again.
и возвращает специальное значение Float.NaN, чтобы обозначить ошибку.
На входе:
'3.14'
'Ivan'
На выходе:
3.14 */

public class lesson4_HW {
    
    // public static void main(String[] args) {
    //     System.out.println(isFloat("3.14"));
    //     System.out.println(isFloat("Ivan"));
    // }

    // public static float isFloat(String input) {
    //     try {
    //         float number = Float.parseFloat(input);
    //         return number;
    //     } catch (NumberFormatException e) {
    //         System.out.println("Your input is not a float number. Please, try again.");
    //         return Float.NaN;
    //     }
    // }

    // public static float isFloat(String input) {
    //     try {
    //         // Попробуйте преобразовать введенный текст в float
    //         return Float.parseFloat(input);
    //     } catch (NumberFormatException e) {
    //         // Если не удалось преобразовать введенный текст в float, выведите сообщение об ошибке
    //         System.out.println("Your input is not a float number. Please, try again.");
    //         // Затем верните специальное значение, например, Float.NaN, чтобы обозначить ошибку
    //         return Float.NaN;
    //     }
    // }

/*Напишите программу, которая вычисляет значение выражения intArray[8] / d, гдеintArray- массив целых чисел, а d - делитель.
Программа проверяет, имеется ли в массиве intArray элемент с индексом 8, и если нет, выводит сообщение о невозможности выполнения операции.
Также программа проверяет, равен ли делитель d нулю, и если да, выводит соответствующее сообщение.
На входе:
'1 2 3 4 5 6 7 8 9'
'1'
На выходе:
intArray[8] / d = 9 / 1 = 9.0
9.0
После запуска программы, если не переданы аргументы командной строки, то intArray будет {0, 1, 2, 3, 4, 5, 6, 7, 8, 9} и d будет равно 0. В этом случае результат выражения intArray[8] / d будет бесконечность (так как деление на 0).
Таким образом, программа выведет сообщение:
It's not possible to evaluate the expression - intArray[8] / d as d = 0.
NaN
В случае, если аргументы командной строки переданы, программа преобразует их в массив intArray и d соответственно. Затем вызывается метод expr, и результат выводится на экран, например:
intArray[8] / d = 8 / 3 = 2.6666666666666665
2.6666666666666665
Программа должна выдавать следующие ошибки:
Если длина массива меньше 9:
It's not possible to evaluate the expression - intArray[8] / d as there is no 8th element in the given array.
В этом случае, если массив имеет меньше 9 элементов, программа сообщает, что не удается вычислить выражение, так как в массиве нет 8-го элемента.
Если d равно 0:
It's not possible to evaluate the expression - intArray[8] / d as d = 0.
Если d равно 0, программа сообщает, что не удается вычислить выражение, так как деление на 0 невозможно.
Если условия не выполняются и программа успешно вычисляет результат, то выводится сообщение:
intArray[8] / d = {значение} / {значение} = {результат}
Где {значение} заменяется на соответствующие значения.
Примеры входных данных и соответствующих сообщений об ошибках:
Входные аргументы: 1 2 3 It's not possible to evaluate the expression - intArray[8] / d as there is no 8th element in the given array.
Входные аргументы: 1 2 3 4 5 6 7 8 9 0
It's not possible to evaluate the expression - intArray[8] / d as d = 0.
Входные аргументы: 1 2 3 4 5 6 7 8 9 10
intArray[8] / d = 9 / 10 = 0.9
*/
    // public static void main(String[] args) {
    //     int[] intArray;
    //     int d;
    //     intArray = new int[]{1, 2, 3, 4, 5, 6};
    //     d = 0;
    //     System.out.println(expr(intArray, d));
    // }
    
    // public static double expr(int[] intArray, int d) {
    //     double result = Double.NaN;
    //     if ((intArray == null) && (d == 0))
    //   {
    //     System.out.println("It's not possible to evaluate the expression - intArray[8] / d as d = 0.");
    //    } 
    //    else if (intArray.length < 9)
    //    {
    //      System.out.println("It's not possible to evaluate the expression - intArray[8] / d as there is no 8th element in the given array.");
    //    }
    //    else if (d == 0)
    //    {
    //      System.out.println("It's not possible to evaluate the expression - intArray[8] / d as d = 0.");
    //    } else {
    //      System.out.println("intArray[8] / d = " + intArray[8] + " / " + d + " = " + (Double.valueOf(intArray[8]) / Double.valueOf(d)));
    //      result = Double.valueOf(intArray[8]) / Double.valueOf(d);}
    //   return result;
    // }
    // public static double expr(int[] intArray, int d) {
    //     if (intArray.length < 9) {
    //         System.out.println("It's not possible to evaluate the expression - intArray[8] / d as there is no 8th element in the given array.");
    //         return Double.NaN;
    //     } else if (d == 0) {
    //         System.out.println("It's not possible to evaluate the expression - intArray[8] / d as d = 0.");
    //         return Double.NaN;
    //     } else {
    //         double catchedRes1 = (double) intArray[8] / d;
    //         System.out.println("intArray[8] / d = " + intArray[8] + " / " + d + " = " + catchedRes1);
    //         return catchedRes1;
    //     }
    // }

/*Напишите программу для выполнения арифметической операции деления двух целых чисел a и b.
При этом программа должна проверить, что делитель b не равен нулю, и выполнить деление только в этом случае.
Если b равен нулю, программа должна вернуть результат равный нулю.
После выполнения операции деления, программа также должна вывести сумму чисел a и b с помощью метода printSum.
Если аргументы не переданы через командную строку, используйте значения по умолчанию.
На входе:
'12'
'5'
На выходе:
17
2.4 */

// public static double expr(int a, int b) {
//     // Введите свое решение ниже
//          if (b == 0) { 
//            System.out.println(a); 
//            return 0; 
//           } 
//        // Иначе, выполняем деление a на b и приводим результат к типу double 
//            else { 
//             printSum(a, b);
//             return (double) a / b; 
//            } 
//    }

//    public static void printSum(int a, int b) {
//     // Введите свое решение ниже
//        // Складываем a и b и сохраняем результат в переменной sum 
//        int sum = a + b; 
//        // Выводим на экран сообщение с суммой 
//        System.out.println(sum);
//        }

// public static double expr(int a, int b) {
//     double result = 0.0; // Initialize the result
//     if (b != 0) {
//         result = (double) a / b; // Perform the division and store the result
//     }
//     printSum(a, b);
//     return result; // Return the result
// }

// public static void printSum(int a, int b) {
//     System.out.println(a + b);
// }


/*
 Напишите программу, которая принимает символ a в качестве аргумента и выполняет следующую проверку:
если символ a равен пробелу '', программа должна выбрасывать исключение с сообщением
"Empty string has been input.".
В противном случае программа должна возвращать сообщение
"Your input was - [символ]", где [символ] заменяется на введенный символ a.
На входе:
'0'
На выходе:
Result: Your input was - 0
 */

 
}
