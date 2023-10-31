package easy;

public class Solution941 {
    public static void main(String[] args) {
        int[] arr = {6, 7, 7, 8, 6};
        System.out.println(validMountainArray(arr));
    }

    public static boolean validMountainArray(int[] arr) {
        if (arr.length <= 2 || arr[0] > arr[1])
            return false;
        boolean chek = true;
        for (int i = 0; i < arr.length - 2; i++) {
            if (chek) {
                if (arr[i] >= arr[i + 1]) {
                    if (arr[i + 1] <= arr[i + 2])
                        return false;
                    else
                        chek = false;
                }
            } else {
                if (arr[i] <= arr[i + 1])
                    return false;
            }
        }
        return arr[arr.length - 2] > arr[arr.length - 1];
    }

}
