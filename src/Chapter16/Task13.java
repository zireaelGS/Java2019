package Chapter16;

import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Task13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //коллекция ТриСет,которая не может содержать дубликатов
        Set<String> firstName = new TreeSet<>();
        //пустая переменная имя,куда далее будут записываться имена
        String name = "";
        //цикл,который позволяет пользователю вводить имена и прерывается,когда вводят 0
        while (!name.equals("0")) {
            System.out.println("Please enter a first name or enter 0 to exit:");
            name = input.nextLine().toLowerCase();
            //добавляем имя в коллекцию( иф делаю т.к. иначе в вывод попадает и ноль тоже)
            if (!name.equals("0")) {
                firstName.add(name);
            }
        }
        //выводим имена на экран, так же добавляем частоту для того,чтобы убедится,что коллекция, не содержит дубликатов
        for (String fName : firstName) {
            int frequency = Collections.frequency(firstName, fName);
            System.out.println("Name: " + fName + " frequency: " + frequency);
        }
        //ну и поиск для пользователя
        System.out.println("Please enter the name,that you want to check: ");
        String checkName = input.next().toLowerCase();
        if (firstName.contains(checkName)) {
            System.out.println("Name: " + checkName + " contains in the list");
        } else {
            System.out.println("Name: " + checkName + " does not contains in the list");
        }

    }
}
