//(Tokenizing and Comparing Strings) Write an application that reads a line of text, tokenizes
//it using space characters as delimiters and outputs only those words ending with the letters "ED".
//Напишите приложение, которое читает строку текста, токенизирует
//        он использует пробелы в качестве разделителей и выводит только те слова, которые заканчиваются буквами «ED».
package Chapter14;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please,enter the sentence:");
        String sentence = input.nextLine().toLowerCase().replaceAll("\\p{P}", "");
        System.out.println(sentence);
        for (String word : sentence.split(" ")) {
            if (word.matches("[a-zA-z]*ed")) {
                System.out.println(word);
            }
        }
    }
}
