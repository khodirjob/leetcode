package easy;

public class Solution70 {
    public static void main(String[] args) {
        System.out.println(climbStairs(10));
    }

    public static int climbStairs(int n) {
        if (n <= 1) {
            return 1;
        }
        int num1 = 1, num2 = 1;
        for (int i = 2; i <= n; i++) {
            num2 = num1 + num2;
            num1 = num2 - num1;
        }
        System.out.println(num2);
        return num2;
    }

}
