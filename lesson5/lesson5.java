import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.management.RuntimeErrorException;

public class lesson5 {

    public static void main(String[] args) {
        try (FileReader reader = new FileReader(
            "D:\\GeekBrains\\10_Exceptions_test\\out\\production\\10_Exceptions_test\\Application.class");
            FileWriter writer = new FileWriter("test");) 
        {
            while (reader.ready()){
                writer.write(reader.read());
            }
        } catch (RuntimeException | IOException e) {
            System.out.println("catch exception: " + e.getClass().getSimpleName());
        }

        try {
            System.out.println("test operation");
        } finally {
            System.out.println("finally operation");
        }

        System.out.println("Copy succesfuly");
    }
}