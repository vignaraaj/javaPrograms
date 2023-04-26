package StringManipulation;

public class StringManipulation {
    // by default string builder has capacity of 16 is exceeded (old capacity*2)+2 (34)
    public static void main(String[] args) {
        System.out.println("Hello world!");
        capitalise();
        sortStringAsc();
        System.out.println(reverseWords("one two three"));
        String str = "house 123@cbe";
        char[] arr = str.toCharArray();
        reverseLettersNotSpecialChars(arr);
        System.out.println("Input string: "+ str );
        String revStr = new String(arr);
        System.out.println("Output string: " + revStr);
    }

    static void capitalise(){
        String word1 = "vignu";
        char[] characters = word1.toCharArray();
        char[] newCharacters = new char[word1.length()];
        for(int i=0;i<word1.length();i++) newCharacters[i]=(char)(characters[i]-32);
        String upperCaseWord = String.valueOf(newCharacters);
        System.out.println(upperCaseWord);
    }
    static void sortStringAsc(){
        String str = "vignaraaj";
        System.out.println("Before Sorting:" + str);
        char temp ;
        char[] chars = str.toCharArray();
        for(int i=0; i < chars.length; i++) {
            for(int j=0; j < chars.length; j++) {
                if(chars[j] > chars[i]) {
                    temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                }
            }
        }
        System.out.print("After Sorting:");
        for(int k=0; k < chars.length; k++) System.out.print(chars[k]);
        System.out.println();
    }
    public static String reverseWords(String str) {
        if (str == null || str.isEmpty()) return str;
        int spaceIndex = str.indexOf(' ');
        if (spaceIndex == -1) return str;
        String firstWord = str.substring(0, spaceIndex);
        String restOfString = str.substring(spaceIndex + 1);
        String reversedRest = reverseWords(restOfString);
        return reversedRest + " " + firstWord;
    }
    public static void reverseLettersNotSpecialChars(char str[]) {
        int r = str.length - 1, l = 0;// Initialize left and right pointers
        while (l < r) { // Traverse string from both ends until 'l' and 'r'
            if (!Character.isAlphabetic(str[l])) l++;  // Ignore special characters
            else if (!Character.isAlphabetic(str[r])) r--;
            else {  // Both str[l] and str[r] are not special
                char tmp = str[l];
                str[l] = str[r];
                str[r] = tmp;
                l++;
                r--;
            }
        }
    }
}