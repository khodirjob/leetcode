package easy;

public class Solution2185 {
    public static void main(String[] args) {

    }

    public int prefixCount(String[] words, String pref) {
        int count = 0;
        for(String str : words){
            if(str.startsWith(pref))
                count++;
        }
        return count;
    }
}
