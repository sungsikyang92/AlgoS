package Lv_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class 뉴스클러스터링 {
    public static int solution(String str1, String str2) {
        int answer = 0;
        String a = str1.toUpperCase();
        String b = str2.toUpperCase();
        if (a.length() % 2 == 0) {
            a = a + " ";
        }
        if (b.length() % 2 == 0) {
            b = b + " ";
        }
        List<String> a_str = new ArrayList<>();
        List<String> b_str = new ArrayList<>();
        List<String> union = new ArrayList<>();
        HashMap<String, Integer> intersec = new HashMap<>();

        for (int i = 0; i < a.length(); i++) {
            String tmp_a = a.substring(i, i + 2);
            if (tmp_a.matches("[a-zA-Z]+")) {
                a_str.add(tmp_a);
                if (!union.contains(tmp_a)) {
                    union.add(tmp_a);
                }
                intersec.put(tmp_a, intersec.getOrDefault(tmp_a, 0) + 1);
            }
        }
        System.out.println(a_str);
        for (int i = 0; i < b.length(); i+=2) {
            String tmp_b = b.substring(i, i + 2);
            if (tmp_b.matches("[a-zA-Z]+")) {
                b_str.add(tmp_b);
                if (!union.contains(tmp_b)) {
                    union.add(tmp_b);
                }
                intersec.put(tmp_b, intersec.getOrDefault(tmp_b, 0) + 1);
            }
        }

        System.out.println(a_str);
        System.out.println(b_str);
        System.out.println(union);
        System.out.println(intersec);
        return answer;
    }

    public static void main(String[] args) {
        String str1 = "FRANCE";
        String str2 = "french";
//        String str1 = "E=M*C^2";
//        String str2 = "e=m*c^2";
        int result = solution(str1, str2);
        System.out.println("결과는 = " + result);
    }
}
