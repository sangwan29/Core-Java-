import java.util.*;
class Employee{
    int salary;
    Employee(int salary){
        this.salary = salary;
        System.out.println("The salary is: "+salary);
    }
}
public class ConstructorIntegerParameter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the salary: ");
        int salary = sc.nextInt();
        new Employee(salary);
    }
}
