package easy;

import java.util.Arrays;

public class Solution344 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        char[] arr = {'A', ' ', 'm', 'a', 'n', ',', ' ', 'a', ' ', 'p', 'l', 'a', 'n', ',', ' ', 'a', ' ', 'c', 'a', 'n', 'a', 'l', ':', ' ', 'P', 'a', 'n', 'a', 'm', 'a'};
        builder.append(arr);
        builder.reverse();
        char[] chars = {'a', 'm', 'a', 'n', 'a', 'P', ' ', ':', 'l', 'a', 'n', 'a', 'c', ' ', ' ', 'a', ',', 'n', 'a', 'l', 'p', ' ', 'a', ' ', ',', 'n', 'a', 'm', ' ', 'A'};
        reverseString(arr);
    }

    public static void reverseString(char[] s) {
        int len = s.length;
        for(int i = 0; i < len/2; i++){
            char c = s[len - 1 - i];
            s[len - 1 - i] = s[i];
            s[i] = c;
        }
    }
}
