package Lv_2;

import java.util.HashMap;

public class 위장 {
    public static int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> box = new HashMap<>();
        for (int i = 0; i < clothes.length; i++) {
            box.put(clothes[i][1], box.getOrDefault(clothes[i][1], 0) + 1);
        }
        for (int cnt : box.values()) {
            answer *= cnt;
        }
        return answer - 1;
    }

    public static void main(String[] args) {
        String[][] clothes = new String[][]{{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        int result = solution(clothes);
    }
}
