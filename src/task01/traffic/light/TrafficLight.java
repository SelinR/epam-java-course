package task01.traffic.light;
import java.util.Scanner;

/**
 * Traffic light task for Epam Java Development Courses
 * Gets minute as input and returns color of current signal
 * @author Selin Roman
 * @version 0.1
 */
public class TrafficLight {
    
    public static void main(String[] args) {
    
        /*
         * Here is data area
         * time is what user inputs
         * cycleDuration represents full cycle of signals
        */
        int time;
        int redDuration = 2;
        int yellowDuration = 3;
        int greenDuration = 5;
        int cycleDuration = redDuration + yellowDuration + greenDuration;
        
        System.out.println("Enter time in minutes ");
        Scanner scanner = new Scanner(System.in);
        time = scanner.nextInt();
    
        /*
         * First we find out at what minute of cycle we're now
         * Then we check which signal traffic light shows
        */
        time %= cycleDuration;
        if (time <= redDuration) {
            System.out.println("Red");
        } else if (time <= redDuration + yellowDuration) {
            System.out.println("Yellow");
        } else if (time <= cycleDuration) {
            System.out.println("Green");
        }
    }
}