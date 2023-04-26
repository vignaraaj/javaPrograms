package StringManipulation;

public class PalindromeRemover {
    public static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String sentence = "He did a good deed";
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) if (!isPalindrome(word)) result.append(word).append(" ");
        System.out.println(result.toString().trim());
    }
}
