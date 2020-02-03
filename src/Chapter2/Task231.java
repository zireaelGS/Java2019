package Chapter2;

public class Task231 {
    public static void main(String[] args) {
        int number = 0;
        int square;
        int cube;

        System.out.println("number " + "square " + "cube");

        while (number <= 10) {

            square = number * number;
            cube = number * number * number;
            System.out.println(number + "\t\t" + square + "\t\t" + cube);
            number++;

        }


    }
}
