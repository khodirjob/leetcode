package medium;

public class Solution29 {
    public static void main(String[] args) {

    }

    public static int anInt = 0;

    public int divide(int dividend, int divisor) {
        if (dividend == 0)
            return 0;
        boolean isPositive = (divisor > 0 && dividend > 0) || (divisor < 0 && dividend < 0);
        int count = 0, num = dividend, num1 = divisor;
        while (num1 - num > 0) {
            num1 -= num;
            num += num;
            count = count + count + 1;
        }

        if (num1 > divisor) {
            while (num1 - divisor >= 0) {
                num1 -= divisor;
                count++;
            }
        }
        return count;
    }
}
