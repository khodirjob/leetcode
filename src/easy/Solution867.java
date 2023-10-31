package easy;

public class Solution867 {
    public static void main(String[] args) {

    }

    public int[][] transpose(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int[][] matrix1 = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix1[j][i] = matrix[i][j];
            }
        }
        return matrix1;
    }
}
