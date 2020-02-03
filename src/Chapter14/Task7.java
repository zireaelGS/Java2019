package Chapter14;

import java.util.ArrayList;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //вводим предложение
        System.out.println("Please,enter the sentence:");
        String sentence = input.nextLine();
        //коллекция, куда потом будем добавлять слова, разделенные пробелом и соответствующие требованию состоять только из букв
        ArrayList<String> words = new ArrayList<>();
        //разбиваем предложение по пробелам и проверям на соответствие паттерну, если соответствует, добавляем в коллекцию
        for (String i : sentence.split(" ")) {
            if (i.matches("[a-zA-Z]*"))
                words.add(i);
        }
        //тут производим преобразование слов в свинский латинский и выводим их
        for (int i = 0; i < words.size(); i++) {
            System.out.print((words.get(i).toLowerCase().substring(1) +
                    words.get(i).toLowerCase().substring(0, 1) + "ay" + " "));
        }
    }
}


