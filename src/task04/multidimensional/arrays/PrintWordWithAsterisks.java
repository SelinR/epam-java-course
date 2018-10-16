package task04.multidimensional.arrays;

public class PrintWordWithStars {
    public static StringBuilder printWord(char[][] charArray, char starsArray[][], boolean fromLeftToRight) {
        StringBuilder word = new StringBuilder();
        if (fromLeftToRight) {
            for (int i = 0; i < charArray.length; i++) {
                for (int j = 0; j < charArray[i].length; j++) {
                    if (starsArray[i][j] == '*') {
                        word.append(charArray[i][j]);
                    }
                }
            }
        } else
            for (int i = 0; i < charArray[i].length; i++) {
                for (int j = 0; j < charArray.length; j++) {
                    if (starsArray[j][i] == '*') {
                        word.append(charArray[j][i]);
                    }
                }
            }
        return word;
    }
    
    public static char[][] getStarsArray() {
        char[][] starsArray = {{'*', '\u0000', '*', '\u0000', '*'},
                {'\u0000', '*', '\u0000', '*', '\u0000'},
                {'*', '\u0000', '*', '\u0000', '*'},
                {'\u0000', '*', '\u0000', '*', '\u0000'},
                {'*', '\u0000', '*', '\u0000', '*'}};
        return starsArray;
    }
}
