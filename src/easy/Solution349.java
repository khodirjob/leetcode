package easy;

import java.util.*;

public class Solution349 {
    public static void main(String[] args) {

    }

    public int[] intersection(int[] nums1, int[] nums2) {
        int[] arr = new int[Math.min(nums1.length, nums2.length)];
        int index = 0;
        boolean[] chek = new boolean[1000];
        for (int i : nums1) {
            chek[i] = true;
        }
        for (int i : nums2) {
            if (chek[i]) {
                arr[index++] = i;
                chek[i] = false;
            }
        }
        return Arrays.copyOfRange(arr, 0, index);
    }
}
