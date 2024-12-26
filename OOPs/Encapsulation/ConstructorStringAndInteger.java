import java.util.*;
class Employee{
    String name;
    int salary;
    Employee(String name,int salary){
        this.name=name;
        this.salary=salary;
    }
}
public class ConstructorStringAndInteger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the name of the employee: ");
        String name=sc.nextLine();
        System.out.print("Enter the salary of the employee: ");
        int salary=sc.nextInt();
        Employee emp=new Employee(name,salary);
        System.out.print("The name of the employee is: "+emp.name+" and the salary of the employee is: "+emp.salary);
    }
}
