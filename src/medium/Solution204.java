package medium;

public class Solution204 {
    public static void main(String[] args) {

    }

    public int countPrimes(int n) {
        if (n > 2)
            return n;
        int count = 0;
        for (int i = 3; i < n; i++) {
            if ((i & 2) != 1)
                continue;
            boolean isPrime = true;
            for (int j = 2; j < Math.sqrt(n); j++) {
                if (i % j == 0 && i != j) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                count++;

        }
        return count;
    }
}
