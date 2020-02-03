package Chapter14;

import java.security.SecureRandom;

public class Task5 {

    public static String[] article = {"the", "a", "one", "some", "any"};
    public static String[] noun = {"boy", "girl", "dog", "town", "car"};
    public static String[] verb = {"drove", "jumped", "ran", "walked", "skipped"};
    public static String[] prepositions = {"to", "from", "over", "under", "on"};

    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();

        for (int i = 0; i < 20; i++) {
            System.out.println(article[random.nextInt(5)] + " " + noun[random.nextInt(5)] +
                    " " + verb[random.nextInt(5)] + " " + prepositions[random.nextInt(5)] +
                    " " + article[random.nextInt(5)] + " " + noun[random.nextInt(5)]);
            if (i == 19) {
                int lastIndex = random.nextInt(5);
                System.out.println(article[lastIndex].substring(0, 1).toUpperCase() + article[lastIndex].substring(1) +
                        " " + noun[random.nextInt(5)] + " " + verb[random.nextInt(5)] +
                        " " + prepositions[random.nextInt(5)] + " " + article[random.nextInt(5)] +
                        " " + noun[random.nextInt(5)] + ".");
            }
        }

    }
}
