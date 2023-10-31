package medium;

import java.util.HashMap;
import java.util.Map;

public class Solution12 {
    public static void main(String[] args) {
//        System.out.println(Math.pow(10, 3));
        System.out.println(intToRoman(399));
    }

    public static String intToRoman(int num) {
        Map<Integer, Character> map = new HashMap<>();
        map.put(1, 'I');
        map.put(5, 'V');
        map.put(10, 'X');
        map.put(50, 'L');
        map.put(100, 'C');
        map.put(500, 'D');
        map.put(1000, 'M');
        int count = (int) Math.log10(num);
        StringBuilder builder = new StringBuilder();
        int k = 0;
        while (num > 0) {
            int pow = (int) Math.pow(10, count - k++);
            int number = num / pow;
            if (number > 5) {
                if (number > 8) {
                    Character c = map.get(10 * pow);
                    Character c1 = map.get(pow);
                    builder.append(c1);
                    builder.append(c);
                } else {
                    Character c = map.get(5 * pow);
                    builder.append(c);
                    Character c1 = map.get(pow);
                    for (int j = 0; j < number - 5; j++) {
                        builder.append(c1);
                    }
                }
            } else if (number == 5) {
                Character c1 = map.get(pow * 5);
                builder.append(c1);
            } else {
                if (number > 3) {
                    Character c = map.get(5 * pow);
                    Character c1 = map.get(pow);
                    builder.append(c1);
                    builder.append(c);
                } else {
                    Character c = map.get(pow);
                    for (int j = 0; j < number; j++) {
                        builder.append(c);
                    }
                }
            }
            num %= pow;
        }
        return builder.toString();
    }

    public static int getValue(char c) {
        switch (c) {
            case 'I' -> {
                return 1;
            }
            case 'V' -> {
                return 5;
            }
            case 'X' -> {
                return 10;
            }
            case 'L' -> {
                return 50;
            }
            case 'C' -> {
                return 100;
            }
            case 'D' -> {
                return 500;
            }
            case 'M' -> {
                return 1000;
            }
        }
        return 0;
    }
}
