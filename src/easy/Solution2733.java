package easy;

public class Solution2733 {
    public static void main(String[] args) {
        int array[] = {3, 30, 24};
        System.out.println("findNonMinOrMax(array) = " + findNonMinOrMax(array));
    }

    public static int findNonMinOrMax(int[] nums) {
        if (nums.length <= 2)
            return -1;
        int num = -1, maxNum = nums[0], minNum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > maxNum) {
                if (maxNum > minNum)
                    num = maxNum;
                maxNum = nums[i];
            } else if (nums[i] < minNum) {
                num = minNum;
                minNum = nums[i];
            } else {
                num = nums[i];
            }
        }

        return num;
    }
}
