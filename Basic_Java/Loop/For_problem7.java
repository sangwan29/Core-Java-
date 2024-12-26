public class For_problem7 {
    public static void main(String[] args) {
        int sum=0;
        for(int i=100;i>=1;i--){
            if(i%2!=0){
                sum=sum+i;
            }
        }
        System.out.print(sum);
    }
}