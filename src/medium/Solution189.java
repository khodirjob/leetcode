package medium;

import java.util.Arrays;

public class Solution189 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        rotate(arr, 3);
    }

    public static void rotate(int[] nums, int k) {
        int len = nums.length;
        k %= len;
        for (int i = 0; i < k; i++) {
            nums[i] = nums[len - k + i] + nums[i];
            nums[len - k + i] = nums[i] - nums[len - k + i];
            nums[i] = nums[i] - nums[len - k - i];
        }


    }

    private static void reverse(int[] nums, int i, int j) {
        while (i < j) {
            nums[i] = nums[j] + nums[i];
            nums[j] = nums[i] - nums[j];
            nums[i] = nums[i] - nums[j];
            i++;
            j--;
        }
    }
}
