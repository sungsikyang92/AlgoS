import java.util.Arrays;
import java.util.Collections;

public class 삼각형의완성조건2 {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        int max = sides[0] + sides[1];
        int min = sides[1] - sides[0];
        for (int i = min + 1; i < max; i++) {
            answer++;
        }

        return answer;
    }
}
