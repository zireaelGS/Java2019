package Chapter9.Task915;

public class HourlyEmployeeTest
{
   public static void main(String[] args) 
   {
      // instantiate HourlyEmployee object
      HourlyEmployee employee = new HourlyEmployee(
         "Vasya", "Pupkin", "666-13-6699", 100, 60);
      
      // get HourlyEmployee data
      System.out.println(
         "Employee information obtained by get methods:");
      System.out.printf("%n%s %s%n", "First name is",
         employee.getFirstName());
      System.out.printf("%s %s%n", "Last name is", 
         employee.getLastName());
      System.out.printf("%s %s%n", "Social security number is", 
         employee.getSocialSecurityNumber());
      System.out.printf("%s %.2f%n", "Hours is",
         employee.getHours());
      System.out.printf("%s %.2f%n", "Wage is",
         employee.getWage());

      employee.setHours(50);
      employee.setWage(10);
      
      System.out.printf("%n%s:%n%n%s%n",                                
         "Updated employee information obtained by toString", employee);
   } // end main
}
