package PG.Lv_0;

import java.util.ArrayList;
import java.util.List;

public class 저주의숫자3 {
    public static int solution(int n) {
        int answer = 0;
        List<Integer> nums_wo3 = new ArrayList<>();
        for (int i = 1; i < 200; i++) {
            if (i % 3 != 0) {
                String tmp_num = Integer.toString(i);
                if (!tmp_num.contains("3")) {
                    nums_wo3.add(i);
                }
            }
        }
        answer = nums_wo3.get(n-1);
        return answer;
    }

    public static void main(String[] args) {
        int result = solution(15);
        System.out.println(result);
    }
}
