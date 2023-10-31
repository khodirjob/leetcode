package medium;

import java.util.*;

public class Solution2384 {
    public static void main(String[] args) {
        System.out.println("ketmon(\"123009123\") = " + ketmon("123009123"));
        System.out.println("largestPalindrome(\"123009123\") = " + largestPalindromic("123009123"));
    }

    public static String largestPalindromic(String num) {

        Map<Character, Integer> map = new HashMap();
        for (char c : num.toCharArray()) {

            map.put(c, map.getOrDefault(c, 0) + 1);

        }
        PriorityQueue<Map.Entry<Character, Integer>> even = new PriorityQueue<>((a, b) -> {
            // if(a.getValue()==b.getValue()){
            //     return b.getKey()-a.getKey();
            // }
            // return a.getValue()-b.getValue();

            return b.getKey() - a.getKey();
        });
        PriorityQueue<Integer> single = new PriorityQueue<>((a, b) -> b - a);

        map.entrySet().forEach(e -> {
            if (e.getValue() == 1)
                single.offer(e.getKey() - '0');
            else if (e.getValue() % 2 == 0) {
                even.offer(e);
            } else if (e.getValue() % 2 == 1 && e.getValue() > 1) {
                Map.Entry<Character, Integer> entry = Map.entry(e.getKey(), e.getValue() - 1);
                even.offer(entry);
                single.offer(e.getKey() - '0');
            }
        });

        // "00001105"
        //'0' -> 5
        //'1' -> 2
        //'5' -> 1
        String mid = "";
        if (single.size() > 0)
            mid = Character.toString((char) (single.poll() + '0'));

        StringBuilder sb = new StringBuilder();
        while (even.size() > 0) {

            int freq = even.peek().getValue();
            char ch = even.poll().getKey();
            freq = freq / 2;
            int temp = freq;
            while (temp-- > 0) {
                sb.append(ch);
            }
        }
        String ans = sb.toString() + mid + new StringBuilder(sb).reverse().toString();


        if (ans.charAt(0) == '0') {

            String strPattern = "^0+(?!$)";
            ans = ans.replaceAll(strPattern, "");
            StringBuilder nb = new StringBuilder(ans);
            nb.reverse();
            ans = nb.toString();
            ans = ans.replaceAll(strPattern, "");
        }

        return ans;

    }

    public static String ketmon(String num) {
        Map<Integer, Integer> map = new HashMap<>();
        for (char c : num.toCharArray()) {
            map.merge((int) c - (int) '0', 1, Integer::sum);
        }
        final int[] number = {0};
        final String[] strings = {"", ""};
        StringBuilder end = new StringBuilder();
        map.forEach((key, value) -> {
            if (value % 2 == 1)
                number[0] = Math.max(number[0], key);
            for (int i = 0; i < value / 2; i++) {
                end.append(key);
            }
        });
        if (end.lastIndexOf("0") == end.length() - 1)
            return String.valueOf(number[0]);
        StringBuilder start = new StringBuilder(end);
        start.reverse();
        if (end.length() * 2 == num.length()) {
            start.append(end);
            return start.toString();
        }
        start.append(number[0]);
        start.append(end);
        return start.toString();
    }

    public static String ketmon2(String num) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Matndagi harf(lar)ni san'aymiz
        for (char c : num.toCharArray()) {
            charCountMap.merge(c, 1, Integer::sum);
        }

        StringBuilder result = new StringBuilder();
        char oddChar = '0';

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            char c = entry.getKey();
            int count = entry.getValue();

            if (count % 2 == 1) {
                oddChar = c;
            }

            for (int i = 0; i < count / 2; i++) {
                result.append(c);
            }
        }

        StringBuilder palindrome = new StringBuilder(result);

        if (oddChar != '0') {
            palindrome.append(oddChar);
        }

        result.reverse();
        palindrome.append(result);

        return palindrome.toString();
    }

}
