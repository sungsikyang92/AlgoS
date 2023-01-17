package Lv_0;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 연속된수의합 {
    public static int[] solution(int num, int total) {
        int[] answer = new int[num];
        Arrays.fill(answer,1);
        for (int i = 1; i < answer.length; i++) {
            answer[i] = answer[i - 1] + 1;
        }
        while (true) {
            if (IntStream.of(answer).sum() < total) {
                for (int i = 0; i < num; i++) {
                    answer[i]++;
                }
            }
            if(IntStream.of(answer).sum() > total){
                for (int i = 0; i < num; i++) {
                    answer[i]--;
                }
            }
            if (IntStream.of(answer).sum() == total) {
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] result = solution(3, 12);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
