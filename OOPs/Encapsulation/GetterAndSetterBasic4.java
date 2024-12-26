import java.util.*;
class Account{
    private double balance;
    private String accountNumber;
    void setAccount(double balance,String accountNumber){
        this.balance=balance;
        this.accountNumber=accountNumber;
    }
    double getBalance() {
        return balance;
    }
    String getAccountNumber(){
        return accountNumber;
    }
}
public class GetterAndSetterBasic4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Account a=new Account();
        System.out.print("Enter account number: ");
        String accountNumber=sc.nextLine();
        System.out.print("Enter the balance: ");
        double balance=sc.nextDouble();
        a.setAccount(balance,accountNumber);
        System.out.println("The balance is: "+a.getBalance());
        System.out.println("The account number is: "+a.getAccountNumber());
    }
}
