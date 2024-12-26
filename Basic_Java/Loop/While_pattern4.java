public class While_pattern4 {
    public static void main(String[] args) {
        int i = 1;
        while (i<=3){
            int j=1;
            while(j<=i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        int k=2;
        while (k>=1){
            int j=1;
            while(j<=k){
                System.out.print("*");
                j++;
            }
            System.out.println();
            k--;
        }
    }
}
