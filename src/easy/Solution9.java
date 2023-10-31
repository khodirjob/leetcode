package easy;

public class Solution9 {
    public static void main(String[] args) {

    }

    public static boolean isPalindrome(int x) {
        int num = x, num2 = 0;
        while (num != 0) {
            num2 = num2 * 10 + num % 10;
            num = num / 10;
        }
        return x == num2;
    }
}
