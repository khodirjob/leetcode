package easy;

public class Solution1486 {
    public static void main(String[] args) {
        int num1 = 2, num2 = 16;
//        System.out.println(2^5^4);
        System.out.println(7^4^7^5^2);
        System.out.println((((7^4)^7)^5)^2);

//        System.out.println(3 ^ 5 ^ 7 ^ 9);

        System.out.println("xorOperation(2, 4) = " + xorOperation(2, 4));
    }

    public static int xorOperation(int n, int start) {
        int sum = start + 2;
        for (int i = 1; i < n; i++) {
            sum = sum ^ (start + 2 * i);
        }
        return sum;
    }
}
