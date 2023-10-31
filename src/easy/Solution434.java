package easy;

public class Solution434 {
    public static void main(String[] args) {

    }

    public int countSegments(String s) {
        s = s.trim();
        if(s.isEmpty())
            return 0;
        int count = 0;
        char[] arr = s.toCharArray();
        for(int i = 1; i < arr.length - 1; i++){
            if(arr[i] == ' ' && arr[i + 1] != ' '){
                count ++;
            }
        }
        return count + 1;
    }
}
