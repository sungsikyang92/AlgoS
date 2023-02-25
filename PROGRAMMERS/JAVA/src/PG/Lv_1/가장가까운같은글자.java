package PG.Lv_1;

import java.util.Arrays;
import java.util.HashMap;

public class 가장가까운같은글자 {
    public static int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character, Integer> chk = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!chk.containsKey(s.charAt(i))) {
                answer[i] = -1;
            } else {
                answer[i] = i - chk.get(s.charAt(i));
            }
            chk.put(s.charAt(i), i);
        }
        return answer;
    }

    public static void main(String[] args) {
        String s = "banana";
        int[] result = solution(s);
        System.out.println(Arrays.toString(result));
    }
}
