package easy;

public class Solution342 {
    public static void main(String[] args) {

    }
    public boolean isPowerOfFour(int n) {
        double v = Math.log10(n) / Math.log10(4);
        return v == (int) v || n == 1;
    }
}
