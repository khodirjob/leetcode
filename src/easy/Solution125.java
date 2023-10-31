package easy;

public class Solution125 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    public static boolean isPalindrome(String s) {
        StringBuilder buffer = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                buffer.append((char) (c + 32));
            } else if (c >= 'a' && c <= 'z') {
                buffer.append(c);
            } else if (c >= '0' && c <= '9') {
                buffer.append(c);
            }
        }
        StringBuilder buffer1 = new StringBuilder();
        buffer1.append(buffer);
        buffer.reverse();
        return buffer1.compareTo(buffer) == 0;
    }
}
