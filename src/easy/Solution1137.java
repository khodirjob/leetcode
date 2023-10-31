package easy;

public class Solution1137 {
    public static void main(String[] args) {
        System.out.println(tribonacci(3));
    }

    public static int tribonacci(int n) {
        int num1 = 1, num2 = 1, num = 2, num0 = 0;
        for (int i = 2; i < n; i++) {
            num = num0 + num1 + num2;
            num0 = num1;
            num1 = num2;
            num2 = num;
        }
        return num;
    }
}
