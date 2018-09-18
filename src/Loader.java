import java.util.Scanner;

public class Loader {
    
    public static void main(String[] args) {
        
        int time;
        int redDuration = 2;
        int yellowDuration = 3;
        int greenDuration = 5;
        int cycleDuration = redDuration + yellowDuration + greenDuration;
        
        System.out.println("Enter time in minutes ");
        Scanner scanner = new Scanner(System.in);
        time = scanner.nextInt();
        
        time %= cycleDuration;
        System.out.println(time);
        
        if (time <= redDuration) {
            System.out.println("Red");
        } else if (time <= redDuration + yellowDuration) {
            System.out.println("Yellow");
        } else if (time <= cycleDuration) {
            System.out.println("Green");
        }
    }
}