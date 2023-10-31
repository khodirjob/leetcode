package easy;

public class Solution1550 {
    public static void main(String[] args) {
        int[] arr = {12, 1, 32, 43, 56, 2, 123, 8, 9, 23, 13, 44, 56};
        threeConsecutiveOdds(arr);
    }

    public static boolean threeConsecutiveOdds(int[] arr) {
        int count  = 0;
        for (int num : arr) {
            // Shuningdek, biz odd sonlarni tekshirishimiz kerak
            if ((num & 1) == 1) { // Num ni 2 ga bo'linishi 1 ni qaytaradi (odd son)
                count++;
                if (count == 3) {
                    return true;
                }
            } else {
                count = 0; // Agar juft son topilsa, hisobchi niqora qilinadi
            }
        }
        return false;
    }
}
