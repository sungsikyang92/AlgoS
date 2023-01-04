import java.util.Arrays;
import java.util.Collections;

public class 최댓값만들기2 {
    public int solution(int[] numbers) {
        int answer = 0;
        int a = 0;
        int b = 0;
        Arrays.sort(numbers);
        a = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        b = numbers[0] * numbers[1];
        if (a > b) {
            answer = a;
        } else {
            answer = b;
        }
        return answer;
    }
}
