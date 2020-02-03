package Chapter16;

import java.util.*;

public class Task18 {
    public static void main(String[] args) {
        Character[] chars = {'!', '@', '#', '$', '%', '^', '&', '*', '(', ')'};
        //создаем коллекцию символов и сразу добавляем туда массив
        List<Character> linkedCharacters = new LinkedList<Character>(Arrays.asList(chars));
        System.out.println("LinkedList object of 10 characters: ");
        //выводим, символы ,которые есть в  коллекции
        for (Character c : linkedCharacters) {
            System.out.print(c + " ");
        }
        System.out.println();

        //создаем новую коллекцию на основе старой
        List<Character> linkedCharacters2 = new LinkedList<>(linkedCharacters);
        //переворачиваем ее с помощью метода коллекшнс
        Collections.reverse(linkedCharacters2);
        //выводим на экран
        System.out.println("Second LinkedList object containing a copy of the first list, but in reverse order: ");
        for (int i = 0; i < chars.length; i++) {
            System.out.print(linkedCharacters2.get(i) + " ");
        }
    }
}
//оставлю этот тут как один из вариантов исполнения,через листИтератор
//    public static void main(String[] args) {
//        Character[] chars = {'!', '@', '#', '$', '%', '^', '&', '*', '(', ')'};
//        Scanner input=new Scanner(System.in);
//        //создаем коллекцию символов
//        List<Character> linkedCharacters1 = new LinkedList<Character>();
//        System.out.println("LinkedList object of 10 characters: ");
//        //добавляем символы в коллекцию
//        for (int i = 0; i < chars.length; i++) {
//            linkedCharacters1.add(chars[i]);
//            System.out.print(linkedCharacters1.get(i) + " ");
//        }

//        System.out.println();
// создаем вторую коллекциюю и копируем туда значения 1й
//        List<Character> linkedCharacters2 = new LinkedList<>(linkedCharacters1);
//создаем лист итератор для второй коллекции и перебираем ее в обратном порядке
//        ListIterator<Character> iterator = linkedCharacters2.listIterator(linkedCharacters2.size());
//        System.out.println("Second LinkedList object containing a copy of the first list, but in reverse order: ");
//        while (iterator.hasPrevious()) {
//            System.out.print(iterator.previous() + " ");
//        }
//    }
