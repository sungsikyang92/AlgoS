package Lv_1;

import java.util.Arrays;

public class 푸드파이트대회 {
    public static String solution(int[] food) {
        String answer = "";
        int[] left = new int[food.length - 1];
        int[] right;
        for (int i = 1; i < food.length; i++) {
            if (food[i] % 2 != 0) {
                food[i]--;
            }
        }
        for (int i = 1; i <= food.length - 1; i++) {
            left[i - 1] = food[i] / 2;
        }
        right = left;
        for (int i = 0; i < left.length; i++) {
            answer += Integer.toString(i + 1).repeat(left[i]);
        }
        answer += "0";
        for (int i = right.length; i > 0; i--) {
            answer += Integer.toString(i).repeat(right[i - 1]);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] food = new int[]{1, 3, 4, 6};
        String result = solution(food);
        System.out.println(result);
    }
}
