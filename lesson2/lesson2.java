/*
Задание №0
Реализуйте метод, принимающий в качестве аргумента целочисленный массив. Если длина массива меньше
некоторого заданного минимума, метод возвращает -1 в качестве кода ошибки, иначе - длину массива.
*/
//public class lesson2
//{
//    public static void main(String[] args)
//    {
//        int[] arr = {1, 2, 3, 4};
//        int min_length = 4;
//        int result = checkArrayLength(arr, min_length);
//        System.out.println(result);
//    }
//    public static int checkArrayLength(int[] arr, int min_length)
//    {
//        if (arr.length < min_length)
//        {
//            return -1;
//        }
//        else
//        {
//            return arr.length;
//        }
//    }
//}

/* Задание №1
Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое
значение. Метод ищет в массиве заданное значение и возвращает его индекс. При этом,
например:
1. если длина массива меньше некоторого заданного минимума, метод возвращает -1 в
качестве кода ошибки.
2. если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
3. если вместо массива пришел null, метод вернет -3
4. придумайте свои варианты исключительных ситуаций и верните соответствующие
коды ошибок.
Напишите метод, в котором реализуете взаимодействие с пользователем. То есть, этот
метод запросит искомое число у пользователя, вызовет первый метод, обработает
возвращенное значение и покажет читаемый результат пользователю. Например, если
вернулся -2, пользователю выведется сообщение: “Искомый элемент не найден”.*/

//public class lesson2 {
//    public static void main(String[] args){
//        int[] arr = null;
//        int element = 3;
//        int result = searchElement(arr, element);
//        if (result == -1){
//            System.out.printf("Длинна массива меньше %d", element);
//        }
//        else if (result == -2){
//            System.out.println("Искомый элемент не найден");
//        }
//        else if (result == -3){
//            System.out.println("Массив не передан");
//        }
//        else {
//            System.out.printf("Искомый элемент имеет индекс %d", result);
//        }
//    }
//
//    public static int searchElement(int[] arr, int element){
//        if (arr == null){
//            return -3;
//        }
//        int min_length = 3;
//        if(arr.length < min_length){
//            return -1;
//        }
//        for (int i = 0; i < arr.length; i++){
//            if(arr[i] == element){
//                return i;
//            }
//        }
//        return -2;
//    }
//}

/*Задание №2
        Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
        Необходимо посчитать и вернуть сумму элементов этого массива.
        При этом накладываем на метод 2 ограничения: метод может работать только с
        квадратными массивами (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать
        только значение 0 или 1.
        Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об
        ошибке.*/

//public class lesson2 {
//    public static void main(String[] args){
//        int[][] matrix = {{1,0,1},{1,1,1},{0,0,3}};
//        int sum = sumElement(matrix);
//        System.out.println(sum);
//    }
//    public static int sumElement(int[][] matrix){
//        int n = matrix.length;
//        for (int[] row: matrix){
//            if (row.length != n){
//                throw new RuntimeException("Количесво строк не равно количеству столбцов!");
//            }
//        }
//        for (int[] row: matrix) {
//            for (int element : row) {
//                if (element != 0 && element != 1) {
//                    throw new RuntimeException("Массив должен содержать только 0 или 1!");
//                }
//            }
//        }
//        int sum = 0;
//        for (int[] row: matrix){
//            for (int element: row) {
//                sum += element;
//            }
//        }
//    return  sum;
//    }
//}

/* Задание №3
Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
Необходимо посчитать и вернуть сумму элементов этого массива.
При этом накладываем на метод 2 ограничения: метод может работать только с
квадратными массивами (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать
только значение 0 или 1.
Если нарушается одно из условий, метод должен вернуть код ошибки.
Программа должна корректно обработать код ошибки и вывести соответствующее
сообщение пользователю.
Сравнить такой вариант обработки исключений с предыдущим.
Какое преимущество у исключений перед
кодами ошибок вы можете назвать
в данном случае?*/

//public class lesson2 {
//    public static void main(String[] args){
//        int[][] matrix = {{1,0,1},{1,1,1},{0,0}};
//        int result = sumElement(matrix);
//        if (result == -1){
//            throw new RuntimeException("Количесво строк не равно количеству столбцов!");
//        }
//        else if (result == -2){
//            throw new RuntimeException("Массив должен содержать только 0 или 1!");
//        }
//        else {
//            System.out.printf("Сумма елементов %d", result);
//        }
//
//    }
//    public static int sumElement(int[][] matrix){
//        int n = matrix.length;
//        for (int[] row: matrix){
//            if (row.length != n){
//                return -1;
//            }
//        }
//        for (int[] row: matrix) {
//            for (int element : row) {
//                if (element != 0 && element != 1) {
//                    return -2;
//                }
//            }
//        }
//        int sum = 0;
//        for (int[] row: matrix){
//            for (int element: row) {
//                sum += element;
//            }
//        }
//    return  sum;
//    }
//}

/*Задание №4
Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента
целочисленный одномерный массив.
Метод должен пройтись по каждому элементу и проверить что он не равен null.
А теперь реализуйте следующую логику:
1. Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом
пользователя
2. Если null’ы встретились в нескольких ячейках, то идеально было бы все их
“подсветить”*/

//import java.util.ArrayList;
//import java.util.List;
//
//public class lesson2 {
//    public static void main(String[] args) {
//        Integer[] arr = {1, 2, 2, 4, 3};
//        List<Integer> nullElements = checkArray(arr);
//        if (nullElements.size() > 0){
//            System.out.println("Массив содержит пустые элементы на позициях" + nullElements);
//        }
//        else {
//            System.out.println("Массив не содержит пустых значений");
//        }
//    }
//    public static List<Integer> checkArray(Integer[] arr){
//        List<Integer> nullElements = new ArrayList<>();
//        for (int i = 0; i < arr.length; i++){
//            if (arr[i] == null){
//                nullElements.add(i);
//            }
//        }
//    return nullElements;
//    }
//}

/*Задание №6
Дан класс
https://github.com/sabinaIsm/test/blob/d2ebf811b85139783b1a0dcbe3714dbb28deee82/Ra
ndomExceptionsClass.java
Запустите код, с помощью анализа стектрейса найдите и, по возможности, исправьте
ошибки, добейтесь корректного выполнения программы.*/

////package java1.lessonsforqa.lesson1;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.LinkedList;
//
//public class lesson2 {
//    public static void main(String[] args) throws IOException {
//        callMethod6("");
//        //ArrayList<String> stringArraysList = (ArrayList<String>) callMethod1();
//        int a=10, b=0;
//        callMethod6("");
//        int div = callMethod2(a, b);
//        System.out.println(div);
//        callMethod6("");
//        //callMethod3(stringArraysList);
//    }
//
//    private static void callMethod6(String s) {
//        System.out.println("Hello World, it's me!");
//    }
//
//    private static void callMethod3(ArrayList<String> stringArraysList) {
//        callMethod6("");
//        callMethod3(stringArraysList);
//    }
//
//    private static Collection<String> callMethod1() throws IOException {
//        callMethod2(100000000, 10-10);
//        return new LinkedList<>();
//    }
//
//    public static int callMethod2(int a, int b) throws IOException {
//        callMethod6("");
////        FileInputStream fis = new FileInputStream("1.txt");
////        fis.read();
////
////        if(fis.available() > 0) throw new RuntimeException();
//        int num = callMethod4("1240");
//        return 1;
//    }
//
//    private static int callMethod4(String s) {
//        callMethod5(s);
//        return Integer.parseInt(s);
//    }
//
//    private static void callMethod5(String s) {
//        callMethod6("");
//        String[] strings = new String[5];
//        for (int i = 0; i < strings.length; i++){
//            strings[i] = s;
//        }
//    }
//}

/*Задание №7 (доп)
Реализуйте метод, принимающий в качестве аргументов два целочисленных массива и
возвращающий новый массив, каждый элемент которого равен сумме элементов двух
входящих массивов в той же ячейке.
Если длины массивов не равны, необходимо как-то оповестить пользователя.*/

//import java.beans.PropertyEditorSupport;
//import java.lang.reflect.Array;
//import java.util.Arrays;
//
//public class lesson2 {
//    public static void main(String[] args) {
//        int[] arr1 = {1,2,3};
//        int[] arr2 = {4,5};
//        try {
//            int[] result = sumArrays(arr1, arr2);
//            System.out.println(Arrays.toString(result));
//        }
//        catch (IllegalArgumentException e){
//            System.out.println(e.getMessage());
//        }
//    }
//    public static int[] sumArrays(int[] arr1, int[] arr2) throws IllegalArgumentException{
//        if (arr1.length != arr2.length){
//            throw new IllegalArgumentException("Массивы имеют разную длину!");
//        }
//        int[] result = new int[arr1.length];
//        for (int i = 0; i < arr1.length; i++){
//            result[i] = arr1[i] + arr2[i];
//        }
//        return result;
//    }
//}

/* Задание №8 (доп)
Реализуйте метод, принимающий в качестве аргументов двумерный массив.
Метод должен проверить что длина строк и столбцов с одинаковым индексом одинакова,
детализировать какие строки со столбцами не требуется.
Как бы вы реализовали подобный метод?*/

public class lesson2 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,},{4,5,6},{7,8}};
        if (checkArray(arr)){
            System.out.println("Колисество строк и столбцов совпадает!");
        }
        else {
            System.out.println("Колисество строк и столбцов не совпадает!");
        }
    }
    public static boolean checkArray(int[][] arr){
        int rows = arr.length;
        if (rows == 0){
            return true;
        }
        for (int i = 1; i < rows; i++){
            if (arr[i].length != rows){
                return false;
            }
        }
        return true;
    }
}