package Lv_0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 모음제거 {
    public static String solution(String my_string) {
        String answer = "";
        String[] vowels = {"a", "e", "i", "o", "u"};
        for (String x : vowels) {
            if (my_string.contains(x)) {
                answer = my_string.replace(x, "");
                my_string = answer;
            } else {
                answer = my_string;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String result = solution("bus");
        System.out.println(result);
    }
}
