package medium;

import java.util.Arrays;

public class Solution2433 {
    public static void main(String[] args) {
        int number = 5;
        System.out.println(7^4);
        System.out.println(3 ^ 6);
        System.out.println("number = " + number);
        number = number ^ 2;
        System.out.println("number = " + number);
        System.out.println(5 ^ 2);
        number = number ^ 0;
        System.out.println("number = " + number);
        System.out.println(5 ^ 2 ^ 0);
        number = number ^ 3;
        System.out.println("number = " + number);
        System.out.println(5 ^ 2 ^ 0 ^ 3);
        number = number ^ 1;
        System.out.println("number = " + number);
        System.out.println(5 ^ 2 ^ 0 ^ 3 ^ 1);
        int[] arr = {5,7,2,3,2};
        findArray(arr);
    }

    public static int[] findArray(int[] pref) {
        System.out.println("findArray(arr).toString() = " + Arrays.toString((pref)));
        int number = pref[0];
        for (int i = 1; i < pref.length; i++) {
            number = number ^ pref[i];
            pref[i] = number;
        }
        System.out.println("findArray(arr).toString() = " + Arrays.toString((pref)));
        return pref;
    }
}
