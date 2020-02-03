package Chapter17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        //создаем сканнер для возможности ввода с клавиатуры
        Scanner input = new Scanner(System.in);
        //Просим пользователя ввести предложение, без знаков пунктуации
        System.out.println("Please, input a sentence assume with no punctuation: ");
        //Добавляем это предложение в коллекцию, приводим его к нижнему регистру,разбиваем его по словам,
        // на всякий случай убираем пунктуацию
        List<String> words = new ArrayList<>(Arrays.asList(input.nextLine().toLowerCase()
                .replaceAll("\\p{P}", "").split(" ")));
        //превращаем коллекцию в стрим, убирием дубликаты,сортируем в алфавитном порядке и выводим на экран
        words.stream().distinct().sorted().forEach(value -> System.out.println(value));

    }
}
