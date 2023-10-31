package easy;

public class Solution1800 {
    public static void main(String[] args) {

    }

    public int maxAscendingSum(int[] nums) {
        int max = nums[0], sum = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            sum += nums[i];
            if (nums[i] >= nums[i + 1]) {
                if (max < sum)
                    max = sum;
                sum = 0;
            }
        }
        return Math.max(sum + nums[nums.length - 1], max);
    }
}
