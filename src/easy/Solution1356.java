package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1356 {
    public static void main(String[] args) {
        int[] arr = {1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1};
        System.out.println(Arrays.toString(sortByBits(arr)));
    }

    public static int[] sortByBits(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Integer.bitCount(arr[" + arr[i] + "]) = " + Integer.bitCount(arr[i]));
            arr[i] += 10001 * Integer.bitCount(arr[i]);
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) arr[i] = arr[i] % 10001;
        return arr;
    }
}
