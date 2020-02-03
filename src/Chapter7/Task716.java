package Chapter7;

public class Task716 {
    public static void main(String[] args) {
        //creating an array in which you will input double values from args(after you reform string to double)
        double[] array = new double[args.length];
        //reform string values from command-line todouble values
        for (int i = 0; i < args.length; i++) {
            double arrayValue = Double.parseDouble(args[i]);
            array[i] = arrayValue;
        }
        //sum all transformed double values from command-line
        double total = 0;
        for (double number : array) {
            total += number;
        }
        //display the sum
        System.out.printf("Sum of the double values passed by the command-line arguments= %f%n", total);
    }
}
