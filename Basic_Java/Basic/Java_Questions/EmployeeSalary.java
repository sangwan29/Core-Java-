import java.util.Scanner;
public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the Employee's ID (Max. 10 chars): ");
        String employeeId = sc.nextLine();
        System.out.print("Input the working hours: ");
        int workingHours = sc.nextInt();
        System.out.print("Salary amount/hr: ");
        double salaryPerHour = sc.nextDouble();
        double salary = workingHours * salaryPerHour;
        System.out.printf("Employee's ID = %s\n", employeeId);
        System.out.printf("Salary = U$ %.2f\n", salary);
    }
}

