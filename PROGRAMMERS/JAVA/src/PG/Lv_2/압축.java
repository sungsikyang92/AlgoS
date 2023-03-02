package PG.Lv_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class 압축 {
    public static int[] solution(String msg) {
        List<Integer> comp = new ArrayList<>();
        HashMap<String, Integer> dict = new HashMap<>();
        char alpha = 'A' - 1;
        for (int i = 1; i < 27; i++) {
            dict.put(Character.toString(alpha + i), i);
        }
        int idx = 27;
        boolean isEnd = false;

        for (int i = 0; i < msg.length(); i++) {
            String word = Character.toString(msg.charAt(i));
            while (dict.containsKey(word)) {
                i++;
                if (i == msg.length()) {
                    isEnd = true;
                    break;
                }
                word += msg.charAt(i);
            }
            if (isEnd) {
                comp.add(dict.get(word));
                break;
            }
            comp.add(dict.get(word.substring(0, word.length() - 1)));
            dict.put(word, idx++);
            i--;
        }
        int[] answer = new int[comp.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = comp.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        String msg = "KAKAO";
        int[] result = solution(msg);
        System.out.println("결과는 = " + Arrays.toString(result));
    }
}
