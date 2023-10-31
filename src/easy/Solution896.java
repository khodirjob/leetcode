package easy;

public class Solution896 {
    public static void main(String[] args) {

    }

    public boolean isMonotonic(int[] nums) {
        int len = nums.length;
        if (len == 1)
            return true;
        boolean chek = nums[0] < nums[len - 1];
        for (int i = 0; i < len - 1; i++) {
            if (chek && nums[i] > nums[i + 1])
                return false;
            else if (!chek && nums[i] < nums[i + 1])
                return false;
        }
        return true;
    }
}
