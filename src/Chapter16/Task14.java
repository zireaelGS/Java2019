package Chapter16;

import java.util.*;

public class Task14 {
    public static void main(String[] args) {
        // create HashMap to store String keys and Integer values
        Map<String, Integer> myMap = new HashMap<>();

        createMap(myMap); // create map based on user input
        displayMap(myMap); // display map content
    } // end main

    // create map from user input
    private static void createMap(Map<String, Integer> map) {
        Scanner scanner = new Scanner(System.in); // create scanner
        System.out.println("Enter a string:"); // prompt for user input
        String input = scanner.nextLine();

        // разбиваю введенное предложение на массив символов
        char[] tokens = input.replace(" ", "").toCharArray();

        //  processing input text
        for (char token : tokens) {
            // if the map contains the letter
            if (map.containsKey(String.valueOf(token))) // is letter in map
            {
                int count = map.get(String.valueOf(token)); // get current count
                map.put(String.valueOf(token), count + 1); // increment count
            } else
                map.put(String.valueOf(token), 1); // add new letter with a count of 1 to map
        }
    }

    // display map content
    private static void displayMap(Map<String, Integer> map) {
        Set<String> keys = map.keySet(); // get keys

        // sort keys
        TreeSet<String> sortedKeys = new TreeSet<>(keys);

        System.out.printf("%nMap contains:%nKey\t\tValue%n");

        // generate output for each key in map
        for (String key : sortedKeys)
            System.out.printf("%-10s%10s%n", key, map.get(key));

        System.out.printf(
                "%nsize: %d%nisEmpty: %b%n", map.size(), map.isEmpty());
    }
}
