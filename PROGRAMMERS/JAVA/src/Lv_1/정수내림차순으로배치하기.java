package Lv_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 정수내림차순으로배치하기 {
    public static long solution(long n) {
        long answer = 0;
        String[] num = Long.toString(n).split("");
        List<String> nn = new ArrayList<>();
        for (String nu : num) {
            nn.add(nu);
        }
        nn.sort(Collections.reverseOrder());
        String tmp = "";
        for (int i = 0; i < nn.size(); i++) {
            tmp += nn.get(i);
        }
        answer = Long.parseLong(tmp);
        return answer;
    }

    public static void main(String[] args) {
        long result = solution(118372);
        System.out.println(result);
    }
}
