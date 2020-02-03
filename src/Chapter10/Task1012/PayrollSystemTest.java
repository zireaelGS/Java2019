package Chapter10.Task1012;// Fig. 10.9: PayrollSystemTest.java
// Employee hierarchy test program.

public class PayrollSystemTest {
    public static void main(String[] args) {
        // create subclass objects
        SalariedEmployee salariedEmployee =
                new SalariedEmployee("John", "Smith", new Date(11, 29, 1995), "111-11-1111", 800.00);
        HourlyEmployee hourlyEmployee =
                new HourlyEmployee("Karen", "Price", new Date(8, 15, 1992), "222-22-2222", 16.75, 40);
        CommissionEmployee commissionEmployee =
                new CommissionEmployee(
                        "Sue", "Jones", new Date(2, 23, 1986), "333-33-3333", 10000, .06);
        BasePlusCommissionEmployee basePlusCommissionEmployee =
                new BasePlusCommissionEmployee(
                        "Bob", "Lewis", new Date(10, 14, 1982), "444-44-4444", 5000, .04, 300);

        // calculate the payroll for each Employee (polymorphically)//

        // create four-element Employee array
        Employee[] employees = new Employee[4];

        // initialize array with Employees
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;

        System.out.printf("Employees processed polymorphically:%n%n");

        for (int month = 1; month < 13; month++) {

            System.out.printf("For the %d month%n", month);

            // generically process each element in array employees
            for (Employee currentEmployee : employees) {

                System.out.println(currentEmployee); // invokes toString-а что так можно вывести инфу разве? выходит если у обхекта есть ту стринг,то можно тупо сделать его принтлн и выведется его ту стринг?

                if (month == currentEmployee.getBirthDate().getMonth()) {
                    System.out.printf(
                            "HAPPY BIRTHDAY!!!!YOU TAKE 100$ BONUS " +
                                    "you earned $%,.2f%n%n", currentEmployee.earnings() + 100);
                } else {
                    System.out.printf(
                            "earned $%,.2f%n%n", currentEmployee.earnings());
                }
            }
        }

    } // end main
} // end class PayrollSystemTest
