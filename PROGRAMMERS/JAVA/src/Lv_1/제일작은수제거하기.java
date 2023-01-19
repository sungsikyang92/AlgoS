package Lv_1;

import java.util.ArrayList;
import java.util.List;

public class 제일작은수제거하기 {
    public List<Integer> solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        if (arr.length == 1) {
            answer.add(-1);
            return answer;
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min) {
                answer.add(arr[i]);
            }
        }
        
        return answer;
    }
}
