package PG.Lv_0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 문자열정렬하기1 {
    public List<Integer> solution(String my_string) {
        List<Integer> answer = new ArrayList<>();
        char[] str = my_string.toCharArray();
        for (char x : str) {
            if (Character.isDigit(x)) {
                String str_c = String.valueOf(x);
                answer.add(Integer.parseInt(str_c));
            }
        }
        Collections.sort(answer);
        return answer;
    }
}
