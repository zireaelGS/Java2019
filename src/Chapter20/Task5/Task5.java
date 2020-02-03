package Chapter20.Task5;

public class Task5 {
    public static void main(String[] args) {
        // create arrays of Integer, Double and Character
        Integer[] integerArray = {1, 2, 3, 4, 5, 6};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};
        //было раньше
        System.out.printf("Array integerArray contains:%n");
        printArray(integerArray); // pass an Integer array
        System.out.printf("%nArray doubleArray contains:%n");
        printArray(doubleArray); // pass a Double array
        System.out.printf("%nArray characterArray contains:%n");
        printArray(characterArray); // pass a Character array

        //просим напечатать коллекцию в заданных границах

        System.out.printf("%nArray integerArray contains the following characters in a given interval:%n");
        printArray(integerArray, 1, 4); // pass an Integer array
        System.out.printf("%nArray doubleArray contains the following characters in a given interval:%n");
        printArray(doubleArray, 0, 5); // pass a Double array
        System.out.printf("%nArray characterArray contains contains the following characters in a given interval:%n");
        printArray(characterArray, 2, 4); // pass a Character array

        //случай, если задали неверные границы
        //1)граница выходит за размеры коллекции
        System.out.printf("%nArray integerArray contains the following characters in a given interval:%n");
        printArray(integerArray, 1, 8);
        //начальная граница больше, чем конечная
        System.out.printf("%nArray integerArray contains the following characters in a given interval:%n");
        printArray(integerArray, 3, 1);
        System.out.printf("%nArray integerArray contains the following characters in a given interval:%n");
        printArray(integerArray, 2, 4);
    }

    // generic method printArray
    public static <T> void printArray(T[] inputArray) {
        // display array elements
        for (T element : inputArray)
            System.out.print(element + " ");
        System.out.println();
    }

    //Overloaded generic method printArray witch takes two additional integer arguments, lowSubscript and highSubscript
    public static <T> void printArray(T[] inputArray, int lowSubscript, int highSubscript) {
        if (lowSubscript > inputArray.length || highSubscript > inputArray.length) {
            try {
                throw new InvalidSubscriptException("You  have mistaken in lowSubscript or highSubscript.Please check it.");
            } catch (InvalidSubscriptException e) {
                e.printStackTrace();
            }
        } else if (lowSubscript > highSubscript) {
            try {
                throw new InvalidSubscriptException("Your lowSubscript is more than highSubscript.Please check it.");
            } catch (InvalidSubscriptException e) {
                e.printStackTrace();
            }
        } else {
            // display array elements
            for (int i = lowSubscript; i <= highSubscript; i++) {
                System.out.print(inputArray[i]);
            }

            System.out.println();
        }

    }
}
