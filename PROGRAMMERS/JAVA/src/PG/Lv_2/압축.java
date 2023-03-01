package PG.Lv_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class 압축 {
    public static List<Integer> solution(String msg) {
        List<Integer> answer = new ArrayList<>();
        HashMap<String, Integer> dict = new HashMap<>();
        char word = 'A' - 1;
        for (int i = 1; i < 27; i++) {
            dict.put(Character.toString(word + i), i);
        }
        int idx = 27;
        boolean isEnd = false;

        for (int i = 0; i < msg.length(); i++) {
            String new_word = Character.toString(msg.charAt(i));
            while (dict.containsKey(new_word)) {
                i++;
                if (i == msg.length()) {
                    isEnd = true;
                    break;
                }
                new_word += msg.charAt(i);
            }
            if (isEnd) {
                answer.add(dict.get(new_word));
                break;
            }
            answer.add(dict.get(new_word.substring(0, new_word.length() - 1)));
            dict.put(new_word, idx++);
            i--;
        }
        return answer;
    }

    public static void main(String[] args) {
        String msg = "KAKAO";
        List<Integer> result = solution(msg);
        System.out.println("결과는 = " + result);
    }
}
