import java.util.*;
class Employee{
    private double salary;
    void setSalary(double salary) {
        if(salary>=0){
            this.salary = salary;
        }
        else{
            System.out.println("Invalid salary");
            this.salary=0;
        }
    }
    double getSalary() {
        return salary;
    }
}
public class GetterAndSetterValidation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Employee e=new Employee();
        System.out.print("Enter the salary: ");
        double salary=sc.nextDouble();
        e.setSalary(salary);
        System.out.println(e.getSalary());
    }
}
