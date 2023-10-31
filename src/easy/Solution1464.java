package easy;

public class Solution1464 {
    public static void main(String[] args) {
        int[] arr = {3,4,5,2};
        System.out.println(maxProduct(arr));
    }

    public static int maxProduct(int[] nums) {
        int max1, max2;
        if (nums[0] > nums[1]) {
            max1 = nums[0];
            max2 = nums[1];
        } else {
            max1 = nums[1];
            max2 = nums[0];
        }
        for (int i = 2; i < nums.length; i++) {
            if (max1 < nums[i]) {
                max2 = max1;
                max1 = nums[i];
            } else if (max2 < nums[i]) {
                max2 = nums[i];
            }
        }
        return (max1 - 1) * (max2 - 1);
    }
}
