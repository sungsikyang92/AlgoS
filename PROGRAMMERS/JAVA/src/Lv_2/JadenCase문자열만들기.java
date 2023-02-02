package Lv_2;

import java.util.Arrays;

public class JadenCase문자열만들기 {
    public static String solution(String s) {
        String answer = "";
        s = s.toLowerCase();
        String[] arr = s.split(" ");

        for (String a : arr) {
            if (a.length() == 0) {
                answer += " ";
            } else {
                answer += a.substring(0, 1).toUpperCase() + a.substring(1) + " ";
            }
        }

        if (s.substring(s.length() - 1, s.length()).equals(" ")) {
            return answer;
        }
        return answer.substring(0, answer.length() - 1);
    }

    public static void main(String[] args) {
        String result = solution("3people   unFollowed me ");
    }
}
