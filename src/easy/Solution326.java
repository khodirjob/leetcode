package easy;

public class Solution326 {
    public static void main(String[] args) {
        System.out.println("isPowerOfThree(243) = " + isPowerOfThree(243));
    }

    public static boolean isPowerOfThree(int n) {
        double v = Math.log10(n) / Math.log10(3);
        return v == (int) v;
    }
}
