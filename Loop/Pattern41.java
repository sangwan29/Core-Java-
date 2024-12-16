public class Pattern41 {
    public static void main(String[] args) {
        int rows=5;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i==2||j==2||i==4||j==4){
                    System.out.print(0+" ");
                }
                else{
                    System.out.print(1+" ");
                }
            }
            System.out.println();
        }
    }
}
