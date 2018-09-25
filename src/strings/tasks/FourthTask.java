package strings.tasks;

import java.util.Scanner;

public class FourthTask {
    public static void main(String[] args) {
        int counter = 0;
        int lenghtOfEqualString = 1;
        
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        char previousLetter = sentence.charAt(0);
    
        for (int i = 1; i < sentence.length(); i++) {
            if (sentence.charAt(i) == previousLetter) {
                lenghtOfEqualString++;
                if (lenghtOfEqualString > 2) {
                    counter++;
                }
                counter += 2;
            }
            
            lenghtOfEqualString = 1;
            
            previousLetter = sentence.charAt(i);
        }
        
        System.out.println("Number of equal symbols " + counter);
    }
    
    
}

