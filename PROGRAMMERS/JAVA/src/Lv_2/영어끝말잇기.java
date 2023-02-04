package Lv_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 영어끝말잇기 {
    public static int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        List<String> box = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (box.contains(words[i])) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                break;
            }
            box.add(words[i]);
            if (i > 0 && words[i - 1].charAt(words[i - 1].length() - 1) != words[i].charAt(0)) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 3;
        String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
//        int n = 2;
//        String[] words = {"hello", "one", "even", "never", "now", "world", "draw"};
//        int n = 5;
//        String[] words = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
        int[] result = solution(n, words);
        System.out.println(Arrays.toString(result));
    }
}
