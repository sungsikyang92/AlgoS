package Lv_0;

import java.util.Arrays;

public class 최댓값만들기 {
    public static int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        answer = numbers[numbers.length-1] * numbers[numbers.length-2];
        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4, 5};
        int result = solution(numbers);
        System.out.println(result);
    }
}
