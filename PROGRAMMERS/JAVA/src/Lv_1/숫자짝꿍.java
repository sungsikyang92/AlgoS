package Lv_1;

import java.util.*;

public class 숫자짝꿍 {
    public static String solution(String x, String y) {
        StringBuilder answer = new StringBuilder();
        Map<String, Integer> box = new HashMap<>();
        for (int i = 0; i < x.length(); i++) {
            box.put(String.valueOf(x.charAt(i)), box.getOrDefault(String.valueOf(x.charAt(i)), 0) + 1);
        }
        List<Integer> tt = new ArrayList<>();
        for (int i = 0; i < y.length(); i++) {
            if (box.containsKey(String.valueOf(y.charAt(i)))) {
                int cnt = box.get(String.valueOf(y.charAt(i))) - 1;
                tt.add(Integer.parseInt(String.valueOf(y.charAt(i))));
                if (cnt == 0) {
                    box.remove(String.valueOf(y.charAt(i)));
                } else {
                    box.put(String.valueOf(y.charAt(i)), cnt);
                }
            }
        }
        Collections.sort(tt,Collections.reverseOrder());

        if (tt.isEmpty()) {
            return "-1";
        } else if (tt.get(0).toString().equals("0")) {
            return "0";
        } else {
            for (int i = 0; i < tt.size(); i++) {
                answer.append(tt.get(i));
            }
            return answer.toString();
        }
    }

    public static void main(String[] args) {
//        String result = solution("100", "2345");
//        String result = solution("100", "203045");
        String result = solution("5525", "1255");
        System.out.println(result);
    }
}
