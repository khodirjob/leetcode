package easy;

import javax.swing.plaf.IconUIResource;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution136 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1};
        int i = singleNumber(arr);
        System.out.println(i);
    }

    public static int singleNumber(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 30001)
                continue;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    nums[i] = 30001;
                    nums[j] = 30001;
                    break;
                }
            }
            if (nums[i] != 30001)
                return nums[i];
        }
        return nums[nums.length - 1];
    }
}
