package Chapter14;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please,enter the sentence:");
        String sentence = input.nextLine().toLowerCase().replaceAll("\\p{P}", "");
        System.out.println(sentence);

        for (String i : sentence.split(" ")) {

            if (i.matches("[a-zA-Z]*")) {
                StringBuffer word = new StringBuffer(i);
                System.out.print(word.reverse() + " ");
            }
        }
    }
}
