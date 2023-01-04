import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 약수구하기 {
    public List<Integer> solution(int n) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer.add(i);
            }
        }
        Collections.sort(answer);
        return answer;
    }
}
