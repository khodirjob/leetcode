package medium;

public class Solution43 {
    public static void main(String[] args) {
        System.out.println(multiply("123", "456"));
        int[] a = {1, 2, 3};
    }

    public static String multiply(String num1, String num2) {
        if(num1.equals(0) || num2.equals(0))
            return "0";
        char[] array1 = num1.toCharArray();
        char[] array2 = num2.toCharArray();
        int len1 = array1.length - 1, len2 = array2.length - 1;
        int[] sum = new int[len1 + len2 + 2];
        for (int i1 = len2; i1 >= 0; i1--) {
            for (int i = len1; i >= 0; i--) {
                sum[(len1 - i1) + (len2 - i)] = sum[(len1 - i1) + (len2 - i)] + (array1[i] - '0') * (array2[i1] - '0');
                if (sum[(len1 - i1) + (len2 - i)] >= 10) {
                    sum[(len1 - i1) + (len2 - i) + 1] = sum[(len1 - i1) + (len2 - i) + 1] + sum[(len1 - i1) + (len2 - i)] / 10;
                    sum[(len1 - i1) + (len2 - i)] = sum[(len1 - i1) + (len2 - i)] % 10;
                }
            }
        }

        StringBuilder str = new StringBuilder(sum[sum.length - 1] == 0 ? "" : String.valueOf(sum[sum.length - 1]));
        for (int i = sum.length - 2; i >= 0; i--) {
            str.append(sum[i]);
        }
        return str.toString();
    }
}
