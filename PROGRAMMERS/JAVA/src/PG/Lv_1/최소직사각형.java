package PG.Lv_1;

import java.util.Arrays;

public class 최소직사각형 {
    public static int solution(int[][] sizes) {
        int answer = 0;
        int[] w = new int[sizes.length];
        int[] h = new int[sizes.length];
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] >= sizes[i][1]) {
                w[i] = sizes[i][0];
                h[i] = sizes[i][1];
            } else {
                w[i] = sizes[i][1];
                h[i] = sizes[i][0];
            }
        }
        int w_max = Arrays.stream(w).max().getAsInt();
        int h_max = Arrays.stream(h).max().getAsInt();
        answer = w_max * h_max;
        return answer;
    }

    public static void main(String[] args) {
        int[][] sizes = new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        int result = solution(sizes);

    }
}
