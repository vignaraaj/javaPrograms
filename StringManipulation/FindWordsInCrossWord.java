package StringManipulation;

import java.util.*;
public class FindWordsInCrossWord {
    public static void findWords(char[][] grid, String[] dictionary) {
        Set<String> words = new HashSet<>(Arrays.asList(dictionary));
        int rows = grid.length;
        int cols = grid[0].length;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                StringBuilder sb1 = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                for (int i = c; i < cols; i++) {
                    sb1.append(grid[r][i]);
                    if (words.contains(sb1.toString())) System.out.println(sb1);
                }
                for (int j = r; j < rows; j++) {
                    sb2.append(grid[j][c]);
                    if (words.contains(sb2.toString())) System.out.println(sb2);
                }
            }
        }
    }

    public static void main(String[] args) {
        char[][] grid = {
                        {'a', 'z', 'o', 'l'},
                        {'v', 'o', 'h', 'o'},
                        {'a', 'o', 'i', 'v'},
                        {'n', 'o', 's', 'e'}
                                           };
        String[] dictionary = {"van", "zol", "love", "no", "is"};
        findWords(grid, dictionary);
        findWordsMyApproach(grid,dictionary);
    }

    static void findWordsMyApproach(char[][] grid, String[] dictionary){
        for(int p = 0 ;p < dictionary.length; p++){
            String str = dictionary[p];
            for(int i=0;i< grid.length;i++){
                for(int j=0; j<grid[0].length;j++){
                    if(grid[i][j]== str.charAt(0) ){
                        if(checkCanPlace(grid,str,i,j,true)) System.out.println(str);
                        if(checkCanPlace(grid,str,i,j,false)) System.out.println(str);
                    }
                }
            }
        }

    }
    static boolean checkCanPlace(char[][] grid , String str , int i , int j,boolean isHorizontal){
        if(isHorizontal && j+str.length()>grid[0].length) return false;
        if(!isHorizontal && i+str.length()>grid.length) return false;
        for(int k = 0 ; k< str.length();k++){
            if(isHorizontal && grid[i][j+k] != str.charAt(k)) return false;
            if(!isHorizontal && grid[i+k][j] != str.charAt(k)) return false;
        }return true;

    }
}
