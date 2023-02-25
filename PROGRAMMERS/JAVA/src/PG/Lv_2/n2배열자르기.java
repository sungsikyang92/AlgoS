package PG.Lv_2;

import java.util.Arrays;

public class n2배열자르기 {
    public static int[] solution(int n, long left, long right) {
        int[] answer = new int[(int) right - (int) left + 1];
        int idx = 0;
        for (long i = left; i <= right ; i++) {
            answer[idx] = (int)Math.max(i / n, i % n) + 1;
            idx++;
        }
        //첫번쨰코드
//        int[] answer = new int[(int)right - (int)left + 1];
//        int[][] tmp = new int[n][n];
////        System.out.println(Arrays.deepToString(tmp));
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (i == j) {
//                    tmp[i][j] = i + 1;
//                }
//                if (i > j) {
//                    tmp[i][j] = i + 1;
//                }
//                if (i < j) {
//                    tmp[i][j] = j + 1;
//                }
//            }
//        }
////        System.out.println(Arrays.deepToString(tmp));
//        int[] tmp2 = new int[n * n];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                tmp2[i * n + j] = tmp[i][j];
//            }
//        }
//        System.out.println(Arrays.toString(tmp2));
//        int idx = 0;
//        for (long i = left; i < right + 1; i++) {
//            answer[idx] = tmp2[(int)i];
//            idx++;
//        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 3;
        long left = 2;
        long right = 5;
        int[] result = solution(n, left, right);
        System.out.println(Arrays.toString(result));
    }
}
