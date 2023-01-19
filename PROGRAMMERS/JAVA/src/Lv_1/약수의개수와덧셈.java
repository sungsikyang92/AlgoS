package Lv_1;

import java.util.ArrayList;
import java.util.List;

public class 약수의개수와덧셈 {
    public int solution(int left, int right) {
        int answer = 0;
        List<Integer> tmp = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    tmp.add(i);
                }
            }
            if (tmp.size() % 2 == 0) {
                answer += i;
            } else if (tmp.size() % 2 != 0) {
                answer -= i;
            }
            tmp.clear();
        }
        return answer;
    }
}
