package strings.tasks;

import java.util.Scanner;

/**
 * Tasks 9.13-9.15 from Zlatopolsky
 *
 * @author Selin Roman
 * @version 1.0
 */
public class FirstThreeTasks {
    public static void main(String[] args) {
        char letter;
        
        Scanner scanner = new Scanner(System.in);
        String someWord = scanner.nextLine();
        System.out.println("Please print some word and then index k "
                + "for task 9.15.");
        int indexOfLetter = scanner.nextInt();
        FirstThreeTasks firstThreeTasks = new FirstThreeTasks();
        
        //Task 9.13. Display on screen third letter of word
        letter = firstThreeTasks.getLetter(someWord, 3);
        System.out.println("9.13 result: " + letter);
        
        //Task 9.14. Display on screen last letter of word
        letter = firstThreeTasks.getLetter(someWord, someWord.length());
        System.out.println("9.14 result: " + letter);
        
        //Task 9.15. Display on screen k letter of word
        letter = firstThreeTasks.getLetter(someWord, indexOfLetter);
        System.out.println("9.15 result: " + letter);
        
        //Task 9.100. Change positions of second and fifth symbols
        
        
    }
    
    /**
     * Takes word and index and returns letter which stands on chosen
     * index in given word
     *
     * @param word
     * @param index
     * @return
     */
    private char getLetter (String word, int index) {
        // TODO add some exceptions
        char letter;
        letter = word.charAt(index - 1);
        return letter;
    }
    
    private String changePostions (String word, int firstIndex, int secondIndex) {
        String changedWord;
        
        
        return changedWord;
    }
}

