/*Реализуйте 3 метода, чтобы в каждом из них получить разные исключения.
        Метод arrayOutOfBoundsException - Ошибка, связанная с выходом за пределы массива
        Метод divisionByZero - Деление на 0
        Метод numberFormatException - Ошибка преобразования строки в число
        Важно: они не должны принимать никаких аргументов*/

public class lesson2_HW {
    public static void arrayOutOfBoundsException() {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(arr[5]);
    }
    public static void divisionByZero() {
        int a = 1;
        int b = 1;
        System.out.println(a / b);
    }

    public static void numberFormatException() {


    }
}