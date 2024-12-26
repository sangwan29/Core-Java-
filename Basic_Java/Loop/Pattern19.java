public class Pattern19 {
    public static void main(String[] args) {
        int k=4;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                System.out.print(k+" ");
                k=k++;
            }
            System.out.println();
        }
    }
}
