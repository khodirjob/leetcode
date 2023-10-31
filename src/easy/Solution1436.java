package easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution1436 {
    public static void main(String[] args) {

    }

    public static String destCity(List<List<String>> paths) {
        if (paths.size() == 1)
            return paths.get(0).get(1);
        Set<String> stringSet = new HashSet<>();
        Set<String> ends = new HashSet<>();
        HashMap<String, Boolean> map = new HashMap<>();
        String begin, end;
        for (List<String> path : paths) {
            if (!stringSet.add(path.get(0))) {
                stringSet.remove(path.get(0));
            }
            if (!stringSet.add(path.get(1))) {
                stringSet.remove(path.get(1));
            }

            ends.add(path.get(1));
        }

        for (String s : stringSet) {
            if (ends.add(s)) {
                return s;
            }
        }
        return "";
    }
}
