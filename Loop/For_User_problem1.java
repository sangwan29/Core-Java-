public class For_User_problem1 {
    public static void main(String[] args) {
        for(int i=2;i<=10;i++){
            System.out.println("Table of "+ i +":");
            for(int j=1;j<=10;j++){
                int table=i*j;
                System.out.print(table+" ");
            }
            System.out.println();
        }
    }
}
