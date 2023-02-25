package PG.Lv_1;

import java.util.*;

public class 실패율 {
    public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[] failer_rate_arr = new double[N];
        int stage_user = 0;
        int total_user = stages.length;
        double failer_rate = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < stages.length; j++) {
                if (stages[j] == (i + 1)) {
                    stage_user++;
                }
            }
            if (stage_user == 0) {
                failer_rate_arr[i] = 0;
            } else {
                failer_rate = (double)stage_user / total_user;
                total_user = total_user - stage_user;
                stage_user = 0;
                failer_rate_arr[i] = failer_rate;

            }
        }
        List<Double> failer_rate_order = new ArrayList<>();
        for (int i = 0; i < failer_rate_arr.length; i++) {
            failer_rate_order.add(failer_rate_arr[i]);
        }
        Collections.sort(failer_rate_order, Collections.reverseOrder());
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (failer_rate_order.get(i) == failer_rate_arr[j]) {
                    answer[i] = j + 1;
                    failer_rate_arr[j] = -1;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int N = 5;
        int[] stages = new int[]{2, 1, 2, 6, 2, 4, 3, 3};
        int[] result = solution(N, stages);
        for (int r : result) {
            System.out.println(r);
        }
    }
}
