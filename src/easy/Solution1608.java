package easy;

public class Solution1608 {
    public static void main(String[] args) {
        int[] array = {1, 1, 2};
        int i = specialArray(array);
        System.out.println("i = " + i);
    }

    public static int specialArray(int[] nums) {
        int x = nums.length;
        int[] counts = new int[x+1];

        for(int elem : nums)
            if(elem >= x)
                counts[x]++;
            else
                counts[elem]++;

        int res = 0;
        for(int i = counts.length-1; i > 0; i--) {
            res += counts[i];
            if(res == i)
                return i;
        }

        return -1;
    }
}
