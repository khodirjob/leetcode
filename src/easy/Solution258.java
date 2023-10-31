package easy;

public class Solution258 {
    public static void main(String[] args) {
        System.out.println(addDigits(10));

    }

    public static int addDigits(int num) {
        while (num >= 10) {
            int sum = 0;
            int i1 = (int) Math.log10(num);
            for (int i = 0; i <= i1; i++) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
}
