package PG.Lv_2;

import java.util.ArrayList;
import java.util.List;

public class 뉴스클러스터링 {
    public static int solution(String str1, String str2) {
        int answer = 0;
        String a = str1.toUpperCase();
        String b = str2.toUpperCase();

        List<String> a_str = new ArrayList<>();
        List<String> b_str = new ArrayList<>();
        List<String> union = new ArrayList<>();
        List<String> intersection = new ArrayList<>();

        for (int i = 0; i < a.length() - 1; i++) {
            String tmp_a = a.substring(i, i + 2);
            if (tmp_a.matches("[a-zA-Z]+")) {
                a_str.add(tmp_a);
            }
        }
        for (int i = 0; i < b.length() - 1; i++) {
            String tmp_b = b.substring(i, i + 2);
            if (tmp_b.matches("[a-zA-Z]+")) {
                b_str.add(tmp_b);
            }
        }
        for (String astr : a_str) {
            if (b_str.remove(astr)) {
                intersection.add(astr);
            }
            union.add(astr);
        }
        for (String bstr : b_str) {
            union.add(bstr);
        }
        double jaccard = 0;
        if (union.size() == 0) {
            jaccard = 1;
        } else {
            jaccard = (double) intersection.size() / union.size();
        }
        answer = (int) (jaccard * 65536);
        return answer;
    }

    public static void main(String[] args) {
//        String str1 = "FRANCE";
//        String str2 = "french";
//        String str1 = "E=M*C^2";
//        String str2 = "e=m*c^2";
        String str1 = "aa1+aa2";
        String str2 = "AAAA12";
//        String str1 = "A+C";
//        String str2 = "DEF";
        int result = solution(str1, str2);
        System.out.println("결과는 = " + result);
    }
}
