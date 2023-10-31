package easy;

import java.util.Arrays;
import java.util.Map;

public class Solution977 {
    public static void main(String[] args) {
        int[] array = {/*-30, -29, -28, -27, -26, -25,*/-23, -15, -12, -9, -6, /*0,*/ 13};
        System.out.println(Arrays.toString(sortedSquares(array)));
    }

    public static int[] sortedSquares(int[] nums) {
        int m = 0, p = nums.length - 1;
        int[] array = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int num1 = nums[p];
            if (num1 <= 0) {
                array[nums.length - 1 - i] = nums[m] * nums[m];
                m++;
                continue;
            }
            int num = nums[m];
            if (Math.abs(num) > num1) {
                array[nums.length - i - 1] = num * num;
                m++;
            } else {
                array[nums.length - i - 1] = num1 * num1;
                p--;
            }
        }
        return array;
    }
}
