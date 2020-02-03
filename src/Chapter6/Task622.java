package Chapter6;

import java.util.Scanner;

public class Task622 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double temperature;
        int option;
        System.out.println("Enter the temperature: ");
        temperature = input.nextDouble();
        System.out.println("Сhoose the appropriate option:\n1-Fahrenheit to Celsius\n2-Celsius to Fahrenheit\n3-Exit from the program");
        option = input.nextInt();
        switch (option) {
            case 1:
                celsius(temperature);
                break;
            case 2:
                fahrenheit(temperature);
                break;
            case 3:
                System.out.println("Goodbye");
                break;
        }

    }

    public static void celsius(double temperature) {
        double celsius;
        celsius = 5.0 / 9.0 * (temperature - 32);
        System.out.println(temperature + " Fahrenheit= " + celsius + " Celsius.");
    }

    public static void fahrenheit(double temperature) {
        double fahrenheit;
        fahrenheit = 9.0 / 5.0 * temperature + 32;
        System.out.println(temperature + " Celsius= " + fahrenheit + " Fahrenheit.");
    }
}
