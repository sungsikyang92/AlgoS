package Lv_1;

import java.util.Arrays;
import java.util.Collections;

public class 문자열내림차순으로배치하기 {
    public static String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        Arrays.sort(str,Collections.reverseOrder());
        for (int i = 0; i < str.length; i++) {
            answer += str[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        String result = solution("Zbcdefg");
        System.out.println(result);
    }
}
