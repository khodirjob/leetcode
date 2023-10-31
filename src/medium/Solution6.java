package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution6 {
    public static void main(String[] args) {
        System.out.println(convert("AasdB", 2));
//        System.out.println(convertt("PAYPALISHIRING", 3));
        System.out.println("PAHNAPLSIIGYIR");
    }

    public static String convert(String s, int numRows) {
        int len = s.length();
        if (len <= numRows || numRows == 1)
            return s;
        char[] array = s.toCharArray();
        boolean chek = true;
        StringBuffer[] str = new StringBuffer[numRows];
        for (int i = 0; i < len; ) {
            if (chek) {
                for (int j = 0; j < str.length && i < len; j++) {
                    str[j] = str[j] != null ? str[j].append(array[i]) : new StringBuffer((len / (2 * (numRows - 1))) + 1).append(array[i]);
                    i++;
                }
                chek = false;
            } else {
                for (int j = str.length - 2; j >= 1 && i < len; j--) {
                    str[j] = str[j] != null ? str[j].append(array[i]) : new StringBuffer((len / (2 * (numRows - 1))) + 1).append(array[i]);
                    i++;
                }
                chek = true;
            }
        }
        StringBuilder builder = new StringBuilder(len);
        for (StringBuffer stringBuffer : str) {
            builder.append(stringBuffer);
        }
        return builder.toString();
    }

    public static String convertt(String s, int numRows) {
        int len = s.length();
        char[][] matrix = new char[len][(len / (2 * (numRows - 1))) + 1];
        int horizont = 0;
        char[] array = s.toCharArray();
        boolean chek = true;
        for (int i = 0; i < array.length; ) {
            if (chek) {
                for (int m = 0; m < matrix.length; m++) {
                    matrix[m][horizont] = array[i++];
                }
                horizont++;
                chek = false;
            } else {
                for (int m = matrix.length - 2; m >= 1; m--) {
                    matrix[m][horizont] = array[i++];
                }
                horizont++;
                chek = true;
            }
        }
        StringBuilder builder = new StringBuilder(len);
        for (char[] chars : matrix) {
            System.out.println(Arrays.toString(chars));
        }
        for (char[] chars : matrix) {
            builder.append(chars);
        }
        return builder.toString();
    }
}

