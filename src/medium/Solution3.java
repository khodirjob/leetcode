package medium;

import java.util.*;

public class Solution3 {
    public static void main(String[] args) {
        StringBuilder buffer = new StringBuilder();
        buffer.append("asd");
        buffer.append("d");
        int i = buffer.indexOf("d");
    }

    public static int lengthOfLongestSubstring(String s) {
        char[] array = s.toCharArray();
        Set<Character> characters = new HashSet<>();

        for (int i = 0; i < array.length; i++) {
            if (characters.contains(array[i])) {
                for (int j = i + 1; j < array.length; j++) {
                    if (characters.contains(array[j])) {
                        int count = j - i;
                        for (Character character : characters) {
                            if (character == array[j]) {
                                break;
                            }
                            count++;
                        }

                    }
                }
            }
        }
        return 0;
    }
}
