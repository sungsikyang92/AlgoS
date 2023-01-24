package Lv_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class 두개뽑아서더하기 {
    public int[] solution(int[] numbers) {
        List<Integer> l_nums = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                l_nums.add(numbers[i] + numbers[j]);
            }
        }
        l_nums = l_nums.stream().distinct().collect(Collectors.toList());
        int[] answer = new int[l_nums.size()];
        Collections.sort(l_nums);
        for (int i = 0; i < l_nums.size(); i++) {
            answer[i] = l_nums.get(i).intValue();
        }
        return answer;
    }
}
