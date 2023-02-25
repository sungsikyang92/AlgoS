package PG.Lv_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 명예의전당1 {
    public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> glory = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            glory.add(score[i]);
            if (glory.size() > k) {
                glory.remove(Integer.valueOf(glory.stream().min(Integer::compare).orElse(-1)));
            }
            answer[i] = glory.stream().min(Integer::compare).orElse(-1);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] score = new int[]{10, 100, 20, 150, 1, 100, 200};
        int[] result = solution(3, score);
        System.out.println(Arrays.toString(result));
    }
}
