package medium;

public class Solution11 {
    public static void main(String[] args) {
        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("maxArea(arr) = " + maxArea(arr));
    }

    public static int maxArea(int[] height) {
        int v = Integer.MIN_VALUE, i = 0, j = height.length - 1;
        while (i <= j) {
            if (height[i] > height[j]) {
                v = Math.max(height[j] * (j - i), v);
                j--;
            } else {
                v = Math.max(height[i] * (j - i), v);
                i++;
            }
        }
        return v;
    }
}
