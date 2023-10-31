package hard;

public class Solution10 {
    public static void main(String[] args) {

    }

    public boolean isMatch(String s, String p) {

        if (s.length() <= p.length())
            return true;
        char[] array = s.toCharArray();
        char[] array1 = p.toCharArray();
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == '*') {
                continue;
            }
        }

        return true;
    }
}
