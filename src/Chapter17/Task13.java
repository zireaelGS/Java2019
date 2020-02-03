package Chapter17;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task13 {
    public static void main(String[] args) {
        //создаем генерацию случайных чисел
        SecureRandom random = new SecureRandom();
        //создаем массив типа чар с набором символов,которые обозначают буквы алфавита
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        //создем коллекцию символов, согласно заданию
        List<Character> characters = new ArrayList<>();
        //добавляем в данную коллекцию 30 случайных символов
        for (int i = 0; i < 30; i++) {
            characters.add(alphabet[random.nextInt(25)]);
        }
        //превращаем данную коллекцию в стрим и сортируем по возрастанию
        System.out.println("Sort the List in ascending order.");
        characters.stream().sorted().forEach(value -> System.out.print(value + " "));
        System.out.println();
        //превращаем данную коллекцию в стрим и сортируем по убыванию
        System.out.println("Sort the List in descending order");
        characters.stream().sorted(Comparator.reverseOrder()).forEach(value -> System.out.print(value + " "));
        System.out.println();
        //превращаем данную коллекцию в стрим и сортируем по возрастанию, а так же удаляем из нее дубликаты
        System.out.println("Display the List in ascending order with duplicates removed.");
        characters.stream().distinct().sorted().forEach(value -> System.out.print(value + " "));
    }
}
