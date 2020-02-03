package Chapter9.Task915;

import Chapter9.Task914.Employee;

//9.15 (Creating a New Subclass of Employee) Other types of Employees might include Salaried-
//        Employees who get paid a fixed weekly salary, PieceWorkers who get paid by the number of pieces
//        they produce or HourlyEmployees who get paid an hourly wage with time-and-a-half—1.5 times the
//        hourly wage—for hours worked over 40 hours.
//        Create class HourlyEmployee that inherits from class Employee (Exercise 9.14) and has
//        instance variable hours (a double) that represents the hours worked, instance variable wage (a double)
//        that represents the wages per hour, a constructor that takes as arguments a first name, a last
//        name, a social security number, an hourly wage and the number of hours worked, set and get methods
//        for manipulating the hours and wage, an earnings method to calculate an HourlyEmployee’s
//        earnings based on the hours worked and a toString method that returns the HourlyEmployee’s
//        String representation. Method setWage should ensure that wage is nonnegative, and setHours
//        should ensure that the value of hours is between 0 and 168 (the total number of hours in a week).
//        Use class HourlyEmployee in a test program that’s similar to the one in Fig. 9.5.
public class HourlyEmployee extends Employee {

    //represents the hours worked
    private double hours;
    //represents the wages per hour
    private double wage;

    //constructor
    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double hours, double wage) {

        super(firstName, lastName, socialSecurityNumber);

        setHours(hours);
        setWage(wage);
    }

    //ensure that the value of hours is between 0 and 168 (the total number of hours in a week)
    public void setHours(double hours) {
        if (hours <= 0.0 || hours >= 168)
            throw new IllegalArgumentException(
                    "Hours must be > 0.0 and < 168");

        this.hours = hours;
    }

    public double getHours() {
        return hours;
    }

    //setWage should ensure that wage is nonnegative
    public void setWage(double wage) {
        if (wage < 0.0)
            throw new IllegalArgumentException(
                    "Wage must be >= 0.0");

        this.wage = wage;
    }

    public double getWage() {
        return wage;
    }

    // earnings method to calculate an HourlyEmployee’s earnings based on the hours
    public double CalcEarnings() {
        return getHours() * getWage();
    }

    // toString method that returns the HourlyEmployee’s String representation
    @Override
    public String toString() {
        return String.format("%s%n%s: %.2f%n",
                super.toString(),
                "Hourly Employee’s earnings", CalcEarnings());
    }
}
