package easy;

public class Solution13 {
    public static void main(String[] args) {
        System.out.println("romanToInt(\"III\") = " + romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        char[] charArray = s.toCharArray();
        int sum = 0;
        for (int i = 0; i < charArray.length - 1; i++) {

            int value = getValue(charArray[i]);
            if (value < getValue(charArray[i + 1])) {
                value *= -1;
            }
            sum += value;
        }
        return sum + getValue(charArray[charArray.length - 1]);
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
