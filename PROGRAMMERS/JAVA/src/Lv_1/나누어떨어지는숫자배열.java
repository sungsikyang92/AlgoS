package Lv_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 나누어떨어지는숫자배열 {
    public List<Integer> solution(int[] arr, int divisor) {
        List<Integer> answer = new ArrayList<>();
        for (int ar : arr) {
            if (ar % divisor == 0) {
                answer.add(ar);
            }
        }
        if (answer.isEmpty()) {
            answer.add(-1);
        } else {
            Collections.sort(answer);
        }
        return answer;
    }
}
