package Lv_0;

public class 겹치는선분의길이 {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] num_cnt = new int[200];
        for (int i = 0; i < lines.length; i++) {
            for (int j = lines[i][0] + 100; j < lines[i][1] + 100; j++) {
                num_cnt[j]++;
            }
        }
        for (int i = 0; i < num_cnt.length; i++) {
            if (num_cnt[i] > 1) {
                answer++;
            }
        }
        return answer;
    }
}
