package medium;

import java.util.*;

public class Solution17 {
    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }

    public static List<String> letterCombinations(String digits) {
        char[] array = digits.toCharArray();
        int count = array[0] == '7' || array[0] == '9' ? 4 : 3;
        List<String> list = new ArrayList<>();
        while (count > 0) {
            StringBuilder builder = new StringBuilder();
            builder.append((char) array[0] - '0' + count + 'a');

        }
        return new ArrayList<>();
    }

}
