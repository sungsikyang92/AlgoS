import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 진료순서정하기 {
    public static int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        List<Integer> order = new ArrayList<>();
        for (int emr : emergency) {
            order.add(emr);
        }
        Collections.sort(order, Collections.reverseOrder());
        for (int i = 0; i < emergency.length; i++) {
            answer[i] = order.indexOf(emergency[i]) + 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] emergency = new int[]{3, 76, 24};
        int[] result = solution(emergency);
        System.out.println(result);
        for (int r : result) {
            System.out.println(r);
        }

    }
}
