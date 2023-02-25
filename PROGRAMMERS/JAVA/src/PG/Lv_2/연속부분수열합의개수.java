package PG.Lv_2;

import java.util.HashSet;
import java.util.Set;

public class 연속부분수열합의개수 {
    public static int solution(int[] elements) {
        int answer = 0;
        Set<Integer> sum_list = new HashSet<>();
        int[] ele_sum = new int[elements.length];
        int n = 0;
        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements.length; j++) {
                ele_sum[i] += elements[(j+n)%elements.length];
                sum_list.add(ele_sum[i]);
            }
            n++;
        }
        answer = sum_list.size();
        return answer;
    }

    public static void main(String[] args) {
        int[] elements = {7, 9, 1, 1, 4};
        int result = solution(elements);
        System.out.println("결과는 = " + result);
    }
}
