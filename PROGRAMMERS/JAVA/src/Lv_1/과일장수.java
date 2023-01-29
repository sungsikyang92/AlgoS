package Lv_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 과일장수 {
    public static int solution(int k, int m, int[] score) {
        int answer = 0;
        int box_num = score.length / m;
        Arrays.sort(score);
        int[][] packed = new int[box_num][m];
        int idx = score.length - 1;
        for (int i = 0; i < box_num; i++) {
            for (int j = 0; j < m; j++) {
                packed[i][j] = score[idx];
                idx--;
            }
        }
        for (int i = 0; i < packed.length; i++) {
            int minvalue = Arrays.stream(packed[i]).min().getAsInt();
            answer += minvalue * m;
        }
        return answer;
    }

    public static void main(String[] args) {
//        int k = 3;
//        int m = 4;
//        int[] score = new int[]{1, 2, 3, 1, 2, 3, 1};
        int k = 4;
        int m = 3;
        int[] score = new int[]{4,1,2,2,4,4,4,4,1,2,4,2};
        int result = solution(k, m, score);
        System.out.println(result);
    }
}
