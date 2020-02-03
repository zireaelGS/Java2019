package Chapter16;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the sentence, where you want to count duplicate words: ");
        String sentence = input.nextLine().toLowerCase().replaceAll("\\p{P}", "");
        System.out.println(sentence);
        Map<String, Integer> myMap = new HashMap<>();
        // разделяем предложение на токены по пробелам
        String[] words = sentence.split(" ");
        for (String word : words) {
            //проверяем есть ли в коллекции это слово
            //если это слово есть, то тогда прибавляем счетчик
            if (myMap.containsKey(word)) {
                //получаем недавнее кол-во повторений этого слова в коллекции
                int count = myMap.get(word);
                //добавляем +1 к счетчику
                myMap.put(word, count + 1);
            } else {
                //если этого слова все еще не встречалось в коллекции
                myMap.put(word, 0);
            }
        }
        System.out.println("The number of duplicate words in a sentence:");
        System.out.printf("%nKey\t\t\tHow many times duplicated: %n");
        //выводим какое слово было продублированно в предложении и сколько раз,
        // если слово в единственном экземпляре,то игнорируем его
        for (String word : myMap.keySet()) {
            if (myMap.get(word) != 0) {
                System.out.printf("%-10s%10s%n", word, myMap.get(word));
            }
        }
    }
}
