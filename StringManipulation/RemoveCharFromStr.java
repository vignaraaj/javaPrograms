package StringManipulation;

public class RemoveCharFromStr {
    public static String removeChars(String s1, String s2) {
        boolean[] seen = new boolean[128];
        for (char c : s2.toCharArray()) seen[c] = true;
        StringBuilder sb = new StringBuilder();
        for (char c : s1.toCharArray()) if (!seen[c]) sb.append(c);
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(removeChars("expErIence", "En"));
    }
}

