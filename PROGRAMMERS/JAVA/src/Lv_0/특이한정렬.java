package Lv_0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 특이한정렬 {
    public static List<Integer> solution(int[] numlist, int n) {
        List<Integer> answer = new ArrayList<>();
        int diff = 0;
        int input_size = numlist.length;
        List<Integer> tmp_nums = new ArrayList<>();
        while (input_size >= 1) {
            for (int i = 0; i < numlist.length; i++) {
                if (Math.abs(numlist[i] - n) == diff) {
                    input_size--;
                    tmp_nums.add(numlist[i]);
                }
            }
            Collections.sort(tmp_nums,Collections.reverseOrder());
            for (int i = 0; i < tmp_nums.size(); i++) {
                answer.add(tmp_nums.get(i));
            }
            tmp_nums.clear();
            diff++;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] numlist = new int[]{1, 2, 3, 4, 5, 6};
        List<Integer> result = solution(numlist, 4);
        System.out.println(result);
    }
}