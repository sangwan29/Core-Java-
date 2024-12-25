import java.util.Scanner;
public class TimeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input seconds: ");
        int totalSeconds = sc.nextInt();
        int hours = totalSeconds / 3600; 
        int remainingSeconds = totalSeconds % 3600;
        int minutes = remainingSeconds / 60; 
        int seconds = remainingSeconds % 60;  
        System.out.println("There are:");
        System.out.println("H:M:S - " + hours + ":" + minutes + ":" + seconds);
    }
}
