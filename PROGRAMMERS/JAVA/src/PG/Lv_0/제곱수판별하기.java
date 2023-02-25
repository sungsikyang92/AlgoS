package PG.Lv_0;

import java.util.ArrayList;
import java.util.List;

public class 제곱수판별하기 {
    public int solution(int n) {
        int answer = 2;
        List<Integer> squar_list = new ArrayList<>();
        for (int i = 1; i <= 1000; i++) {
            squar_list.add(i * i);
        }
        if (squar_list.contains(n)) {
            answer = 1;
        }
        return answer;
    }
}
