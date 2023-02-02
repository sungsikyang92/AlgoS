package Lv_2;

import java.util.Arrays;

public class 최댓값과최솟값 {
    public static String solution(String s) {
        String answer = "";
        int[] arr = Arrays.asList(s.split(" ")).stream().mapToInt(Integer::parseInt).toArray();
        Arrays.sort(arr);
        answer += Integer.toString(arr[0]) + " " + Integer.toString(arr[arr.length - 1]);
        return answer;
    }

    public static void main(String[] args) {
        String result = solution("1 2 3 4");
    }
}
