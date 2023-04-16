package PG;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class testcheck {
    public static int[] solution(int n, long k) {
        int[] answer = new int[1];
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        List<List<Integer>> order = new ArrayList<>();

        return answer;
    }

    public static void main(String[] args) {
        int n = 3;
        int k = 5;
        int[] result = solution(n, k);
        System.out.println("결과는 = " + Arrays.toString(result));
    }
}


