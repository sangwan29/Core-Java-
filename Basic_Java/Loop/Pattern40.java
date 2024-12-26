public class Pattern40 {
    public static void main(String[] args) {
        int rows = 5; 
        int k = 1;
        for (int i = 0; i < rows; i++) {
            int s = k +(i * 2); 
            for (int j = 0; j < rows; j++) {
                System.out.print(s + " ");
                s=s+2; 
            }
            System.out.println(); 
        }
    }
}

