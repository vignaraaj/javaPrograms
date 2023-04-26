package StringManipulation;

public class SubstringCheck {
    public static boolean isSubstring(String str1, String str2) {
        int n1 = str1.length();
        int n2 = str2.length();
        for (int i = 0; i <= n1 - n2; i++) { // Loop through first string
            int j;
            for (j = 0; j < n2; j++) { // Check if the current substring of first string matches the second string
                if (str2.charAt(j) == '*') continue;
                if (str1.charAt(i + j) != str2.charAt(j)) break;
            }
            if (j == n2) return true;// If all characters of second string are matched
        }
        return false; // If second string is not found as substring
    }

    public static void main(String[] args) {
        String str1 = "Spoon";
        String str2 = "Sp**n";
        System.out.println(isSubstring(str1, str2)); // true

        str1 = "Zoho";
        str2 = "*o*o";
        System.out.println(isSubstring(str1, str2)); // true

        str1 = "Man";
        str2 = "n*";
        System.out.println(isSubstring(str1, str2)); // false

        str1 = "Subline";
        str2 = "line";
        System.out.println(isSubstring(str1, str2)); // true
    }
}



