package easy;

public class Solution283 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 8, 0, 3, 12};
        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num == 0)
                count++;
        }
        for (int i = 0; i <= nums.length - count; i++) {
            nums[i] = num(nums, i);
        }
        for (int i = 0; i < count; i++) {
            nums[nums.length - 1 - i] = 0;
        }
        for (int num : nums) {
            System.out.println(num);
        }
    }

    static int num(int[] nums, int i) {
        for (int i1 = i + 1; i1 < nums.length; i1++) {
            if (nums[i1] != 0)
                return nums[i1];
        }
        return 0;
    }
}
