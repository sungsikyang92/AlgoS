package PG.Lv_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class 압축 {
    public static List<Integer> solution(String msg) {
        List<Integer> answer = new ArrayList<>();
        HashMap<String, Integer> dict = new HashMap<>();
        char word = 'A' - 1;
        System.out.println(word);
        for (int i = 1; i < 27; i++) {
            dict.put(Character.toString(word + i), i);
        }

        return answer;
    }

    public static void main(String[] args) {
        String msg = "KAKAO";
        List<Integer> result = solution(msg);
        System.out.println("결과는 = " + result);
    }
}
