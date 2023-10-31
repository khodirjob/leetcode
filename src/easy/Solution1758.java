package easy;

public class Solution1758 {
    public static void main(String[] args) {
        int i = minOperations("10010100");
//        10010100
//        01010101
        System.out.println("i = " + i);
    }

    public static int minOperations(String s) {
        int count1 = 0, count0 = 0;
        boolean chek1 = true, chek0 = false;
        for (char c : s.toCharArray()) {
            if (c == '1') {
                if (chek1) {
                    count1++;
                    chek1 = false;
                } else {
                    chek1 = true;
                }

                if (chek0) {
                    count0++;
                    chek0 = false;
                } else {
                    chek0 = true;
                }

            } else {
                if (chek1) {
                    chek1 = false;
                } else {
                    chek1 = true;
                    count1++;
                }

                if (chek0) {
                    chek0 = false;
                } else {
                    chek0 = true;
                    count0++;
                }
            }
        }

        return Math.min(count0, count1);
    }
}
