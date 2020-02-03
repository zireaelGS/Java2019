package Chapter20;

public class Task6 {
    public static void main(String[] args) {
        // create arrays of Integer, Double and Character
        Integer[] integerArray = {1, 2, 3, 4, 5, 6};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};
        String[] stringArray = {"one", "two", "three", "four", "five", "six", "seven", "eight"};

        System.out.printf("Array integerArray contains:%n");
        printArray(integerArray); // pass an Integer array
        System.out.printf("%nArray doubleArray contains:%n");
        printArray(doubleArray); // pass a Double array
        System.out.printf("%nArray characterArray contains:%n");
        printArray(characterArray); // pass a Character array
        System.out.printf("%nArray characterArray contains:%n");
        printArray(stringArray); // pass a Character array
    }

    // generic method printArray
    public static <T> void printArray(T[] inputArray) {
        // display array elements
        for (T element : inputArray)
            System.out.printf("%s ", element);

        System.out.println();
    }

    // nongeneric method printArray
    public static void printArray(String[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.printf("%4s\t", inputArray[i]);
            if (i == (inputArray.length / 2) - 1) {
                System.out.printf("%n", inputArray[i]);
            }
        }
        System.out.println();
    }
}
