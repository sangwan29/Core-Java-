public class Pattern64 {
    public static void main(String[] args) {
        char ch='E';
        for(int i=5;i>=1;i--){
            for(int s=4;s>=i;s--){
                System.out.print("* ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
            }
            ch--;
            System.out.println();
        }
    }
}
