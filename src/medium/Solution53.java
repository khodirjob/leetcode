package medium;

public class Solution53 {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] arr1 = {-2, -1};
        int[] arr2 = {5,4,-1,7,8};
        System.out.println(maxSubArray(arr));
        System.out.println(maxSubArray(arr1));
        System.out.println(maxSubArray(arr2));
    }

    public static int maxSubArray(int[] nums) {
        int sum = 0, max = nums[0];
        for (int num : nums) {
            sum += num;
            max = Math.max(sum, max);
            if (sum <= 0) {
                sum = 0;
            }
        }
        return max;
    }
}
