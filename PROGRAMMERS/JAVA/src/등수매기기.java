import java.util.Arrays;
import java.util.Collections;

public class 등수매기기 {
    public static int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        Arrays.fill(answer, 1);
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score.length; j++) {
                if (score[i][0] + score[i][1] > score[j][0] + score[j][1]) {
                    answer[j]++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
//        int[][] score = new int[][]{{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}};
        int[][] score = new int[][]{{0, 20}, {80, 100}, {10, 10}, {90, 90}, {20, 0}};
        int[] result = solution(score);
        for (int r : result) {
            System.out.println(r);
        }
    }
}
