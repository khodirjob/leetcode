package easy;

public class Solution367 {
    public static void main(String[] args) {

    }

    public boolean isPerfectSquare(int num) {
        int i = 1;
        while (num > 0) {
            num = num - i;
            i = i + 2;
        }
        return num == 0;
    }
}
