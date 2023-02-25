package PG.Lv_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class 폰켓몬 {
    public static int solution(int[] nums) {
        int answer = 0;
        int choice_num = nums.length / 2;
        List<Integer> tmp = Arrays.stream(nums).boxed().collect(Collectors.toList());
        tmp = tmp.stream().distinct().collect(Collectors.toList());
        if (tmp.size() >= choice_num) {
            answer = choice_num;
        }else {
            answer = tmp.size();
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 1, 2, 3};
        int result = solution(nums);
    }
}
