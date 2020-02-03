package Chapter7;

public class Task714 {
    public static void main(String[] args) {
        int number1 = 1;
        int number2 = 2;
        int number3 = 3;
        int number4 = 4;
        System.out.printf("number1= %d%nnumber2= %d%nnumber3= %d%nnumber4= %d%n", number1, number2, number3, number4);
        System.out.printf("product of the number1 and number2 is %d", product(number1, number2));
        System.out.printf("%nproduct of the number1, number2 and number3 is %d", product(number1, number2, number3));
        System.out.printf("%nproduct of the number1, number2, number3 and number4 is %d", product(number1, number2, number3, number4));
    }

    public static int product(int... numbers) {
        int total = 1;
        for (int i : numbers) {
            total *= i;
        }
        return total;
    }
}
