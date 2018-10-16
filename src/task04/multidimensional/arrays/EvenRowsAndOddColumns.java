package task04.multidimensional.arrays;

public class EvenRows {
    public static StringBuilder getWordFromEvenElementsOfRows(char[][] charArray, boolean evenRows) {
        StringBuilder words = new StringBuilder();
        for (int i = 0; i < charArray.length; i++) {
            for (int j = 0; j < charArray[i].length; j++) {
                if (isEven(j) && evenRows) {
                    words.append(charArray[i][j]);
                } else if (!isEven(j) && !evenRows) {
                    words.append(charArray[j][i]);
                }
            }
            words.append(" ");
        }
        return words;
    }
    
    public static boolean isEven(int index) {
        return (index % 2 == 0);
    }
}
