package Lv_2;

import java.util.*;

public class 귤고르기 {
    public static int solution(int k, int[] tangerine) {
        int answer = 0;
        Arrays.sort(tangerine);
        HashMap<Integer, Integer> tan_cnt = new HashMap<>();
        for (int i = 0; i < tangerine.length; i++) {
            tan_cnt.put(tangerine[i], tan_cnt.getOrDefault(tangerine[i], 0) + 1);
        }
        List<Integer> tan_list = new ArrayList<>(tan_cnt.keySet());

        tan_list.sort(((o1, o2) -> tan_cnt.get(o2) - tan_cnt.get(o1)));

        int y = 0;
        while (k > 0) {
            k -= tan_cnt.get(tan_list.get(y));
            answer++;
            y++;
        }
        return answer;
    }

    public static void main(String[] args) {
        int k = 6;
        int[] tangering = {1, 3, 2, 5, 4, 5, 2, 3};
//        int[] tangering = {1,1,1,1,2,2,2,3};
        int result = solution(k, tangering);
    }
}
