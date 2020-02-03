package Chapter3.Task313;

public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;


    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            System.out.println("ERROR\nEnter the positive definition of the salary");
        }
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary <= 0) {
            System.out.println("Please enter the positive salary");
        } else {
            this.monthlySalary = monthlySalary;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }


    // как правильоно все же вводить get или просто название переменной?
    public void info() {
        System.out.printf("%s %s  salary is %.2f $ %n%n",
                getFirstName(), getLastName(), getMonthlySalary());
    }

    public void infoYear() {
        System.out.printf("%s %s yearly salary is %.2f $ %n%n", firstName, lastName, 12 * monthlySalary);
    }

    public void riseSalary() {
        monthlySalary = monthlySalary + ((monthlySalary / 100) * 10);
        System.out.println("The increased salary is " + monthlySalary + "$\n");
    }

}

