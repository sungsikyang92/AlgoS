import java.util.ArrayList;
import java.util.List;

public class n의배수고르기 {
    public List<Integer> solution(int n, int[] numlist) {
        List<Integer> answer = new ArrayList<>();
        for (int num : numlist) {
            if (num % n == 0) {
                answer.add(num);
            }
        }
        return answer;
    }
}
