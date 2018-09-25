package strings.tasks;

import java.util.Scanner;

public class FirstThreeTasks {
    public static void main(String[] args) {
        char letter;
        
        Scanner scanner = new Scanner(System.in);
        String someWord = scanner.nextLine();
        int indexOfLetter = scanner.nextInt();
        FirstThreeTasks firstThreeTasks = new FirstThreeTasks();
        
        letter = firstThreeTasks.getLetter(someWord, 3);
        System.out.println("9.13 result: " + letter);
        
        letter = firstThreeTasks.getLetter(someWord, someWord.length());
        System.out.println("9.14 result: " + letter);
        
        letter = firstThreeTasks.getLetter(someWord, indexOfLetter);
        System.out.println("9.15 result: " + letter);
        
    }
    
    private char getLetter (String word, int index) {
        char letter;
        letter = word.charAt(index - 1);
        return letter;
    }
}

