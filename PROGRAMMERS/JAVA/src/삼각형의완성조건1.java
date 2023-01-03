import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class 삼각형의완성조건1 {
    public static int solution(int[] sides) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for (int num : sides) {
            list.add(num);
        }
        list.sort(Comparator.naturalOrder());
        if (list.get(2) < list.get(0) + list.get(1)) {
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] sides = new int[]{199,72,222};
        int result = solution(sides);
        System.out.println(result);
    }
}
