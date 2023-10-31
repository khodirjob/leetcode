package easy;

public class Solution2432 {
    public static void main(String[] args) {
        int array[][] = {{0, 3}, {2, 5}, {0, 9}, {1, 15}};
        System.out.println("hardestWorker(array) = " + hardestWorker(1, array));
    }

    public static int hardestWorker(int n, int[][] logs) {
        int id = 0, time = 0, maxTime = 0;
        for (int i = 0; i < logs.length; i++) {
            int t = logs[i][1] - time;
            if (t > maxTime) {
                id = logs[i][0];
                maxTime = t ;
            } else if (t == maxTime)
                id = Math.min(logs[i][0], id);
            time = logs[i][1];
        }
        return id;
    }
}
