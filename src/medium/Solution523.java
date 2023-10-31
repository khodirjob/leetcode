package medium;

import java.util.HashMap;

public class Solution523 {
    public static void main(String[] args) {
        boolean b = checkSubarraySum(new int[]{0}, 1);
        System.out.println("b = " + b);
    }

    public static boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        int[] prefixSum = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            prefixSum[i] = (prefixSum[i - 1] + nums[i - 1]) % k;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 0); // To handle cases where the entire array is a good subarray.

        for (int i = 1; i <= n; i++) {
            if (map.containsKey(prefixSum[i])) {
                if (i - map.get(prefixSum[i]) >= 2) {
                    return true;
                }
            } else {
                map.put(prefixSum[i], i);
            }
        }

        return false;

    }
}
