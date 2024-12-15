import java.util.*;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter choice:");
        System.out.println("type 1:for print table 2 to 10");
        System.out.println("type 2:for print table 5 to 9");
        int type=sc.nextInt();
        if(type==1){
            int i = 2; 
            while (i <= 10) {
                System.out.println("Table of " + i + ":");
                int j = 1; 
                while (j <= 10) {
                    int table=i*j;
                    System.out.println(table);
                    j++;
                }
                System.out.println();
                i++;
            }
        }
        else if(type==2){
            int i = 5;
            while (i <= 9) {
                System.out.println("Table of " + i + ":");
                int j = 1;
                while (j <= 10) {
                    int table=i*j;
                    System.out.println(table);
                    j++;
                }
                System.out.println();
                i++;
            }
        }
    }
}

