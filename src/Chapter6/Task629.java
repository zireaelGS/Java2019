package Chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class Task629 {
    public enum statusSide {HEAD, TAIL}

    public static SecureRandom random = new SecureRandom();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;
        int heads = 0;
        int tails = 0;
        boolean breaker = true;
        while (breaker) {
            System.out.println("Choose option:\n1-Toss coin\n2-Exit");
            option = input.nextInt();
            switch (option) {
                case 1:
                    if (flip() == 0) {
                        heads++;
                    } else {
                        tails++;
                    }
                    break;
                case 2:
                    breaker = false;
                    break;
            }
        }
        System.out.println("Heads fell " + heads + " times\n" + "Tails fell " + tails + " times.");
    }

    public static int flip() {
        int tossCoin = random.nextInt(2);
        statusSide side;
        switch (tossCoin) {
            case 0:
                side = statusSide.HEAD;
                System.out.println(side);
                break;
            case 1:
                side = statusSide.TAIL;
                System.out.println(side);
                break;
        }
        return tossCoin;
    }
}
