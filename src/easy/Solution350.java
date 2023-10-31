package easy;

import java.util.*;

public class Solution350 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 5, 90,0,1};
        int[] array2 = {0, 1, 2, 4,1, 3};
        System.out.println(Arrays.toString(intersect(array1, array2)));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        boolean[][] chek = new boolean[1000][1000];
        for (int i : nums1) {
            if (chek[i][0]) {
                int i1 = 1;
                while (chek[i][i1]) {
                    i1++;
                }
                chek[i][i1] = true;
            } else {
                chek[i][0] = true;
            }
        }
        int[] arr = new int[Math.min(nums1.length, nums2.length)];
        int index = 0;
        for (int i : nums2) {
            if (chek[i][0]) {
                int count = 0;
                while (chek[i][count++]) {
                }
                chek[i][count - 2] = false;
                arr[index++] = i;
            }
        }
        return Arrays.copyOfRange(arr, 0, index);
    }



/*

    public static int[] intersect(int[] nums1, int[] nums2) {
        boolean[][] chek = new boolean[1000][1000];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums1) {
            map.merge(i, 1, Integer::sum);
        }
        int[] arr = new int[Math.min(nums1.length, nums2.length)];
        int index = 0;
        for (int i : nums2) {
            Integer i1 = map.get(i);
            if (i1 != null) {
                if (i1 > 1) {
                    map.put(i, i1 - 1);
                } else {
                    map.remove(i);
                }
                arr[index++] = i;
            }
        }
        return Arrays.copyOfRange(arr, 0, index);
    }



*/

    /*

     */
}
