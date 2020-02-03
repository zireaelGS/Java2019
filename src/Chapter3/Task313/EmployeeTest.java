package Chapter3.Task313;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Daineris", "Targaryen", 5000);
        Employee employee2 = new Employee("John", "Stark", 600);
// display enetered data of objects
        employee1.info();
        employee2.info();
//display each object’s yearly salary
        employee1.infoYear();
        employee2.infoYear();
//display each Employee a 10% raise
//        employee1.riseSalary();
//        employee2.riseSalary();
        employee1.setMonthlySalary(employee1.getMonthlySalary() + ((employee1.getMonthlySalary() / 100) * 10));
        System.out.println("The increased salary is " + employee1.getMonthlySalary() + "$\n");
        employee2.setMonthlySalary(employee2.getMonthlySalary() + ((employee2.getMonthlySalary() / 100) * 10));
        System.out.println("The increased salary is " + employee2.getMonthlySalary() + "$\n");
//display each Employee’s yearly salary again(with a 10% raise)
        employee1.infoYear();
        employee2.infoYear();
    }
}
