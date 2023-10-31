package easy;

import java.util.HashMap;
import java.util.Map;

public class Solution2287 {
    public static void main(String[] args) {
        System.out.println("rearrangeCharacters(\"asdasasd\", \"aadsqwfsss\") = " + rearrangeCharacters("abbaccaddaeea", "aaaaa"));
    }

    public static int rearrangeCharacters(String s, String target) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : target.toCharArray()) {
            map.merge(c, 1, Integer::sum);
        }

        Map<Character, Integer> map1 = new HashMap<>();
        for (char c : s.toCharArray()) {
            map1.merge(c, 1, Integer::sum);
        }

        int count = 100;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            Character key = entry.getKey();
            Integer characterCount = map1.get(key);
            if (characterCount == null)
                return 0;
            count = Math.min(count, characterCount / entry.getValue());
        }

        return count;
    }
}
