package medium;

import com.sun.source.tree.Tree;

import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeSet;

public class Solution823 {
    public static void main(String[] args) {

    }

    int mod = (int) 1e9 + 7;

    public int numFactoredBinaryTrees(int[] arr) {
        Arrays.sort(arr);
        int ans = 0;
        HashMap<Integer, Long> map = new HashMap<>(arr.length * 4);

        for (int x : arr) {

            long ways = 1;
            int max = (int) Math.sqrt(x);
            for (int j = 0, left = arr[0]; left <= max; left = arr[++j]) {
                if (x % left != 0) continue;
                int right = x / left;
                if (map.containsKey(right))
                    ways = (ways + map.get(left) * map.get(right) * (left == right ? 1 : 2)) % mod;
            }

            map.put(x, ways);
            ans = (int) ((ans + ways) % mod);
        }
        return ans;

    }
}
