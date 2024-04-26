/*
Напишите приложение, которое будет запрашивать у пользователя следующие данные в произвольном порядке, разделенные пробелом:
Фамилия Имя Отчество датарождения номертелефона пол
Форматы данных:
фамилия, имя, отчество - строки
дата_рождения - строка формата dd.mm.yyyy
номер_телефона - целое беззнаковое число без форматирования
пол - символ латиницей f или m.
Приложение должно проверить введенные данные по количеству. Если количество не совпадает с требуемым, вернуть код ошибки, обработать его и показать пользователю сообщение, что он ввел меньше и больше данных, чем требуется.
Приложение должно попытаться распарсить полученные значения и выделить из них требуемые параметры. Если форматы данных не совпадают, нужно бросить исключение, соответствующее типу проблемы. Можно использовать встроенные типы java и создать свои. Исключение должно быть корректно обработано, пользователю выведено сообщение с информацией, что именно неверно.
Если всё введено и обработано верно, должен создаться файл с названием, равным фамилии, в него в одну строку должны записаться полученные данные, вида
<Фамилия><Имя><Отчество><датарождения> <номертелефона><пол>
Однофамильцы должны записаться в один и тот же файл, в отдельные строки.
Не забудьте закрыть соединение с файлом.
При возникновении проблемы с чтением-записью в файл, исключение должно быть корректно обработано, пользователь должен увидеть стектрейс ошибки.
 */
package lesson6_HW;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class lesson6_HW {
    private static final int field_num = 6;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        String[] str = input.split(" ");
        if (str.length != field_num) {
            System.err.println("Введено неверное количество полей. Должно быть 6 полей");
        }
        String last_name = str[0];
        String first_name = str[1];
        String middle_name = str[2];

        LocalDate birth_data;
        try {
            DataTimeFormatter formatter = DataTimeFormatter.ofPattern("dd.mm.yyyy");
            birth_data = LocalDate.parse(str[3], formatter);
        } catch (DataTimeParseException e) {
            System.out.println("Неверно введена дата");
            return;
        }
        long phone_num;
        try {
            phone_num = Long.parseLong(str[4]);
        } catch (NumberFormatException e) {
            System.out.println("Неверно введен номер телефона");
            return;
        }
        String gen = str[5];
        if (gen != "m" && gen != "f") {
            System.out.println("Неверно введен пол. Должен быть m или f");
            return;
        }

        String f = last_name + ".txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(f, true))){
            writer.write(last_name + " " + first_name + " " + middle_name + " " + birth_data.format(DateTimeFormatter.ISO_LOCAL_DATE) + " " + phone_num + " " + gen);
            writer.newLine();
        } catch (IOException e){
            System.out.println("Ошибка записи в файл");
        }
            
    }
}
