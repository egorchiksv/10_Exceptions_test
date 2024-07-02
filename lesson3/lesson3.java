package lesson3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.management.RuntimeErrorException;

public class lesson3 {

    public static void main(String[] args) throws IOException {
        FileReader test = null;
        try {
            test = new FileReader("D:\\GeekBrains\\10_Exceptions_test\\out\\production\\10_Exceptions_test\\Application.class");
            test.read();
        } catch (RuntimeException | IOException e) {
            System.out.println("catch exception: " + e.getClass().getSimpleName());
        } finally {
            System.out.println("finaly start");
            if (test != null) {
                try {
                    test.close();
                } catch (IOException e) {
                    System.out.println("exception while close");
                }
            }
            System.out.println("finaly finished");
        }

        // int number = 1;
        // try {
        // number = 10 / 0;
        // String test = null;
        // System.out.println(test.lines());
        // } catch (ArithmeticException e) {
        // System.out.println("operation divide by zero not supported");
        // } catch(NullPointerException e){
        // System.out.println("nullpointer exeption");
        // }
        // System.out.println(number);

        // Object object = new String("123");
        // File file = (File) object;
        // System.out.println(file);
        // String number = "123fq";
        // int result = Integer.parseInt(number);
        // System.out.println(result);
        // List<Object> emptyList = Collections.emptyList();
        // emptyList.add(new Object());
    }
}