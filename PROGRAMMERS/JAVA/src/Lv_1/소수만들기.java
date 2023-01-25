package Lv_1;

import java.util.ArrayList;
import java.util.List;

public class 소수만들기 {
    public int is_prime(int num) {
        if (num == 0 || num == 1) {
            return 0;
        }
        if (num == 2) {
            return 1;
        }
        for (int i = 2; i <= (int) Math.sqrt(num); i++) {
            if (num % i == 0) {
                return 0;
            }
        }
        return 1;
    }
    public int solution(int[] nums) {
        int answer = 0;
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    numbers.add(nums[i] + nums[j] + nums[k]);
                }
            }
        }
        for (int i = 0; i < numbers.size(); i++) {
            if (is_prime(numbers.get(i)) == 1) {
                answer++;
            }
        }
        return answer;
    }
}
