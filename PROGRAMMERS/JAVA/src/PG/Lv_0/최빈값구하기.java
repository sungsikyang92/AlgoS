package PG.Lv_0;

import java.util.Arrays;

public class 최빈값구하기 {
        public static int solution(int[] array) {
        int answer = 0;
        int[] cnt_arr = new int[1001];
        for (int i = 0; i < array.length; i++) {
            cnt_arr[array[i]]++;
        }
        int max_cnt = Arrays.stream(cnt_arr).max().getAsInt();
        int max = max_cnt;
        int cnting = 0;
        for (int i = 0; i < cnt_arr.length; i++) {
            if (cnt_arr[i] == max) {
                answer = i;
                cnting += 1;
            }
        }
        if (cnting > 1) {
            answer = -1;
        }
        return answer;
    }
//    public int solution(int[] array) {
//        int answer = 0;
//        int[] arr = new int[999];
//
//        for (int i = 0; i < array.length; i++) {
//            arr[array[i]]++;
//        }
//        int max = 0;
//        int max_index = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//                max_index = i;
//            }
//        }
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == max) {
//                count++;
//            }
//        }
//        if (count > 1) {
//            return -1;
//        }
//        answer = max_index;
//        return answer;
//    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 3, 3, 4};
//        int[] array = new int[]{1,1,2,2};
//        int[] array = new int[]{1};
        int result = solution(array);
        System.out.println(result);
    }
}
