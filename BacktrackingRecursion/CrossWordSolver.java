package BacktrackingRecursion;

import java.util.*;
public class CrossWordSolver {
    private char[][] crossword;
    private List<String> words;
    private char[][] updatedCrossword;
    public CrossWordSolver(char[][] crossword, List<String> words) {
        this.crossword = crossword;
        this.words = words;
        updatedCrossword = new char[crossword.length][crossword[0].length];
        for (int i = 0; i < crossword.length; i++)
            for (int j = 0; j < crossword[0].length; j++) updatedCrossword[i][j] = crossword[i][j];
    }
    public void solveCrossword() {
        if (solveHelper(0)) printCrossword();
        else System.out.println("No solution found.");
    }
    private boolean solveHelper(int wordIndex) {
        if (wordIndex >= words.size()) return true;
        String word = words.get(wordIndex);
        for (int i = 0; i < crossword.length; i++) {
            for (int j = 0; j < crossword[0].length; j++) {
                if (crossword[i][j] == word.charAt(0) && canPlaceWord(word, i, j, true)) {
                    char[][] newCrossword = updateCrossword(updatedCrossword, word, i, j, true);
                    if (solveHelper(wordIndex + 1)) {
                        crossword = newCrossword;
                        return true;
                    }
                }
                if (crossword[i][j] == word.charAt(0) && canPlaceWord(word, i, j, false)) {
                    char[][] newCrossword = updateCrossword(updatedCrossword,word, i, j, false);
                    if (solveHelper(wordIndex + 1)) {
                        crossword = newCrossword;
                        return true;
                    }
                }
            }
        }return false;
    }
    private boolean canPlaceWord(String word, int row, int col, boolean isHorizontal) {
        if (isHorizontal && col + word.length() > crossword[0].length) return false;
        if (!isHorizontal && row + word.length() > crossword.length) return false;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int r = isHorizontal ? row : row + i;
            int c1 = isHorizontal ? col + i : col;
            if (crossword[r][c1] != c) return false;
        }return true;
    }
    private char[][] updateCrossword(char[][] updatedCrossword,String word, int row, int col, boolean isHorizontal) {
        if (isHorizontal) for (int i = 0; i < word.length(); i++) updatedCrossword[row][col + i] = (char)(word.charAt(i)-32);
        else for (int i = 0; i < word.length(); i++) updatedCrossword[row + i][col] = (char)(word.charAt(i)-32);
        return updatedCrossword;
    }
    private void printCrossword() {
        for (int i = 0; i < crossword.length; i++) {
            for (int j = 0; j < crossword[0].length; j++) System.out.print(crossword[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        char[][] crossword = {{'b', 'l', 'u', 'e', 'c', 'a'},
                {'o', 'a', 'h', 'd', 'q', 'p'},
                {'x', 'c', 'r', 'o', 'w', 'p'},
                {'d', 'o', 'p', 'g', 'x', 'l'},
                {'s', 'w', 'h', 'i', 't', 'e'}};
        List<String> words =Arrays.asList(new String[] {"apple", "white", "crow", "blue", "box", "dog"});
        CrossWordSolver c = new CrossWordSolver(crossword,words);
        c.solveCrossword();
    }
}




