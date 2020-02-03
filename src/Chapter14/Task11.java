package Chapter14;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int counter = 0;//переменная для подсчета того,сколько раз встречался символ

        System.out.println("Please,enter the sentence:");
        StringBuilder sentence = new StringBuilder(input.nextLine().toLowerCase());

        System.out.println("Please,enter a character");
        String character = input.nextLine().toLowerCase();

        //выходим из цикла тогда, когда символа в предложении не нашли
        //если все же нашли,то удаляем с первого символа и до нужного нам включительно и добавляем счетчик, а затем снвоа ищем,
        //уже без учета проверенной части предложения
        while (sentence.indexOf(character) != -1) {
            sentence.delete(0, sentence.indexOf(character) + 1);
            counter += 1;
        }

        System.out.println("The number of occurrences of the character " + character + " in the text = " + counter);


        //НУ И ЕЩЕ ВАРИАНТ СО СТРИНГОМ
//        int counter = 0;//переменная для подсчета того,сколько раз встречался символ
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Please,enter the sentence:");
//        String sentence = input.nextLine().toLowerCase();
//
//        System.out.println("Please,enter a character");
//        String character = input.nextLine().toLowerCase();

//        //с помощью команды indexOf находится индекс нужного символа и затем образается после этого символа и переприсваивается
//        // новое значение предложения и добавляется единица к счетчику( сколько раз встретили нужный символ).
//        // Так до тех пор, пока не обнаружится,что больше таких символов нет.
//        while (sentence.indexOf(character) != -1) {
//            sentence = sentence.substring(sentence.indexOf(character) + 1);
//            counter += 1;
//        }
//        System.out.println("The number of occurrences of the character " + character + " in the text = " + counter);
    }
}
