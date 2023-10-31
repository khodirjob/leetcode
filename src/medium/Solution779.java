package medium;

import java.time.LocalDateTime;

public class Solution779 {
    public static void main(String[] args) {
        System.out.println("LocalDateTime.now() = " + LocalDateTime.now());
        System.out.println("kthGrammar(3, 2) = " + kthGrammar(30, 434991989));
        System.out.println("LocalDateTime.now() = " + LocalDateTime.now());
    }

    public static int kthGrammar(int n, int k) {
        if (k == 1)
            return 0;
        if (k < (1 << n - 2))
            return kthGrammar(n - 1, k);
        if (k == (1 << n - 2))
            return n % 2;
        return kthGrammar(n - 1, k - (1 << n - 2)) ^ 1;
    }
}
