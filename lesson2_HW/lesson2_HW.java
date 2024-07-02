/*
 * Реализуйте 3 метода, чтобы в каждом из них получить разные исключения.
 * Метод arrayOutOfBoundsException - Ошибка, связанная с выходом за пределы
 * массива
 * Метод divisionByZero - Деление на 0
 * Метод numberFormatException - Ошибка преобразования строки в число
 * Важно: они не должны принимать никаких аргументов
 */

// public class lesson2_HW {
// public static void main(String[] args) {

// arrayOutOfBoundsException();
// }
// public static void arrayOutOfBoundsException() {
// int[] arr = {1,2,3,4,5,6};
// int el_val = arr[5];
// }
// public static void divisionByZero() {
// int a = 1;
// int b = 1;
// int c = a / b;
// }

// public static void numberFormatException() {
// int num = Integer.parseInt("1");

// }
// }

// class Answer {
// public static void arrayOutOfBoundsException() {
// int[] array = new int[10];
// System.out.println(array[11]); // Выход за пределы массива
// }

// public static void divisionByZero() {
// int a = 1;
// int b = 0;
// int c = a / b; // Деление на ноль
// }

// public static void numberFormatException() {
// String str = "abc";
// int num = Integer.parseInt(str); // Ошибка преобразования строки в число
// }
// }

// public class Printer {
// public static void main(String[] args) {
// Answer ans = new Answer();
// try {
// ans.arrayOutOfBoundsException();
// } catch (ArrayIndexOutOfBoundsException e) {
// System.out.println("Выход за пределы массива");
// }

// try {
// ans.divisionByZero();
// } catch (ArithmeticException e) {
// System.out.println("Деление на ноль");
// }

// try {
// ans.numberFormatException();
// } catch (NumberFormatException e) {
// System.out.println("Ошибка преобразования строки в число");
// }
// }
// }

/*
 * Реализуйте метод subArrays, принимающий в качестве аргументов два
 * целочисленных массива a и b, и возвращающий новый массив c, каждый элемент
 * которого равен разности элементов двух входящих массивов в той же ячейке.
 * Если длины массивов не равны - верните нулевой массив длины 1.
 * Напишите свой код в методе subArrays класса Answer. Метод subArrays принимает
 * на вход два параметра:
 * int[] a - первый массив
 * int[] b - второй массив
 * Пример
 * a = new int[]{4, 5, 6};
 * b = new int[]{1, 2, 3};
 * Вывод: [3, 3, 3]
 * a = new int[]{4, 5, 6};
 * b = new int[]{1, 2, 3, 5};
 * Вывод: [0]
 */

// import java.util.Arrays;

// public class lesson2_HW {
// public static void main(String[] args) {
// int[] a = { 4, 5, 6 };
// int[] b = { 1, 2 };
// int[] c = subArrays(a, b);
// System.out.print(Arrays.toString(c));
// }

// public static int[] subArrays(int[] a, int[] b) {
// if (a.length != b.length) {
// System.out.print("[0]");
// System.exit(0);
// }
// int[] c = new int[a.length];
// for (int i = 0; i < a.length; i++) {
// c[i] = a[i] - b[i];
// }
// return c;
// }
// }

// import java.util.Arrays;

// class Answer {
// public int[] subArrays(int[] a, int[] b){
// if(a == null || b == null || a.length != b.length){
// return new int[1]; // нулевой массив длины 1 будет означать различие в длине
// массивов
// }
// else{
// int[] c = new int[a.length];
// for(int i = 0; i < a.length; i++){
// c[i] = a[i] - b[i];
// }
// return c;
// }
// }
// }

// public class Printer{
// public static void main(String[] args) {
// int[] a = {};
// int[] b = {};

// if (args.length == 0) {
// a = new int[]{4, 5, 6};
// b = new int[]{1, 2, 3};
// }
// else{
// a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
// b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
// }

// Answer ans = new Answer();
// String itresume_res = Arrays.toString(ans.subArrays(a, b));
// System.out.println(itresume_res);
// }
// }

/*
 * Реализуйте метод divArrays, принимающий в качестве аргументов два
 * целочисленных массива a и b, и возвращающий новый массив с, каждый элемент
 * которого равен частному элементов двух входящих массивов в той же ячейке.
 * Если длины массивов не равны - верните нулевой массив длины 1.
 * Важно: При выполнении метода единственное исключение, которое пользователь
 * может увидеть - RuntimeException, т.е. ваше.
 * Напишите свой код в методе divArrays класса Answer. Метод divArrays принимает
 * на вход два параметра:
 * int[] a - первый массив
 * int[] b - второй массив
 * Пример
 * a = new int[]{12, 8, 16};
 * b = new int[]{4, 2, 4};
 * Вывод: [3, 4, 4]
 * a = new int[]{12, 8, 16, 25};
 * b = new int[]{4, 2, 4};
 * Вывод: [0]
 */

// import java.util.Arrays;

// public class lesson2_HW {
// public static void main(String[] args) {
// int[] a = { 12, 8, 16 };
// int[] b = { 4, 2, 4 };
// int[] c = divArrays(a, b);
// System.out.print(Arrays.toString(c));
// }

// public static int[] divArrays(int[] a, int[] b) {
// if(a == null || b == null || a.length != b.length) {
// System.out.print("[0]");
// System.exit(0);
// }
// int[] c = new int[a.length];
// for (int i = 0; i < a.length; i++) {
// c[i] = a[i] / b[i];
// }
// return c;
// }
// }

// import java.util.Arrays;

// class Answer {
// public int[] divArrays(int[] a, int[] b){
// if(a == null || b == null || a.length != b.length){
// return new int[1]; // нулевой массив длины 1 будет означать различие в длине
// массивов
// }
// else{
// int[] c = new int[a.length];
// for(int i = 0; i < a.length; i++){
// if (b[i] == 0) throw new RuntimeException("Division by 0");
// else c[i] = a[i] / b[i];
// }
// return c;
// }
// }
// }

// public class Printer{
// public static void main(String[] args) {
// int[] a = {};
// int[] b = {};

// if (args.length == 0) {
// a = new int[]{12, 8, 16};
// b = new int[]{4, 2, 4};
// }
// else{
// a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
// b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
// }

// Answer ans = new Answer();
// String itresume_res = Arrays.toString(ans.divArrays(a, b));
// System.out.println(itresume_res);
// }
// }
