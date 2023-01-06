import java.util.Arrays;

public class 삼육구게임 {
    public int solution(int order) {
        int answer = 0;
        String nums = Integer.toString(order);
        char[] nums_c = nums.toCharArray();
        for (char num : nums_c) {
            if (num == '3') {
                answer++;
            } else if (num == '6') {
                answer++;
            } else if (num == '9') {
                answer++;
            }
        }
        return answer;
    }
}