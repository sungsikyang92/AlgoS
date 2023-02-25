package PG.Lv_0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class A로B만들기 {
    public static int solution(String before, String after) {
        int answer = 0;
        List<String> b_word = Arrays.asList(before.split(""));
        List<String> a_word = Arrays.asList(after.split(""));
        Collections.sort(b_word);
        Collections.sort(a_word);
        if (a_word.equals(b_word)) {
            answer = 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        int result = solution("olleh", "hello");
        System.out.println(result);
    }
}
