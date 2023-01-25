package Lv_1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class 크기가작은부분문자열 {
    public static int solution(String t, String p) {
        int answer = 0;
        long input = Long.parseLong(p);
        List<Long> num_list = new ArrayList<>();
        for (int i = 0; i < t.length() - p.length() + 1; i++) {
            num_list.add(Long.parseLong(t.substring(i, i + p.length())));
        }
        for (long num : num_list) {
            if (num <= input) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
//        int result = solution("3141592", "271");
//        int result = solution("500220839878", "7");
//        int result = solution("10203", "15");
        int result = solution("1221351118575141528544", "12511");
        System.out.println(result);
    }
}
