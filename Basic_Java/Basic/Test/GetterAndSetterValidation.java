import java.util.*;
class Employee{
    private int salary;
    void setSalary(int salary){
        if(salary>=0){
            this.salary=salary;
        }
        else{
            System.out.println("The salary cannot be neagtive...");
            this.salary=0;
        }
    }
    int getSalary(){
        return salary;
    }
}
public class GetterAndSetterValidation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Employee e=new Employee();
        System.out.print("Enter the salary of the employee: ");
        int salary=sc.nextInt();
        e.setSalary(salary);
        System.out.println("The salary of the employee is: "+e.getSalary());
    }
}
