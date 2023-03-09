package PG.Lv_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 할인행사 {
    public static int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int start_point = 0;
        int end_point = 10;
        List<String> need_to_buy = new ArrayList<>();
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i]; j++) {
                need_to_buy.add(want[i]);
            }
        }
        while (end_point <= discount.length) {
            List<String> tmp = new ArrayList<>(need_to_buy);
            for (int i = start_point; i < end_point; i++) {
                if (tmp.contains(discount[i])) {
                    tmp.remove(discount[i]);
                }
            }
            if (tmp.isEmpty()) {
                answer++;
            }
            end_point++;
            start_point++;
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] want = {"banana", "apple", "rice", "pork", "pot"};
        int[] number = {3, 2, 2, 2, 1};
        String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};
        int result = solution(want, number, discount);
        System.out.println("결과는 = " + result);
    }
}
