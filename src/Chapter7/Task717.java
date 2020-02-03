package Chapter7;

import java.security.SecureRandom;

public class Task717 {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();
        int[] frequency = new int[13];
        for (int i = 0; i < 36000000; i++) {
            int die1 = 1 + randomNumbers.nextInt(6); // first die roll
            int die2 = 1 + randomNumbers.nextInt(6); // second die roll
            int sum = die1 + die2;
            ++frequency[sum];
        }
        System.out.printf("%s%10s%n", "Face", "Frequency");
        for (int face = 2; face < frequency.length; face++)
            System.out.printf("%4d%10d%n", face, frequency[face]);

    }

}
