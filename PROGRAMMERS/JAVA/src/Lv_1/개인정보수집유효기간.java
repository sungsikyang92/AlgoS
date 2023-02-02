package Lv_1;

import java.util.Arrays;

public class 개인정보수집유효기간 {
    public static int[] solution(String today, String[] terms, String[] privacies) {
        int[] tmp_result = new int[privacies.length];
        int today_year = Integer.parseInt(today.split("\\.")[0]);
        int today_month = Integer.parseInt(today.split("\\.")[1]);
        int today_day = Integer.parseInt(today.split("\\.")[2]);
        int today_total = (today_year * 12 * 28) + (today_month * 28) + today_day;

        for (String term : terms) {
            String term_type = term.split(" ")[0];
            int term_month = Integer.parseInt(term.split(" ")[1]);
            for (int i = 0; i < privacies.length; i++) {
                String privacy_date = privacies[i].split(" ")[0];
                int privacy_year = Integer.parseInt(privacy_date.split("\\.")[0]);
                int privacy_month = Integer.parseInt(privacy_date.split("\\.")[1]);
                int privacy_day = Integer.parseInt(privacy_date.split("\\.")[2]);
                int privacy_total = (privacy_year * 12 * 28) + (privacy_month * 28) + privacy_day - 1;
                if (privacies[i].contains(term_type)) {
                    tmp_result[i] = privacy_total + (term_month * 28);
                }
            }
        }

        int expired_cnt = 0;

        for (int result : tmp_result) {
            if (today_total > result) {
                expired_cnt++;
            }
        }

        int[] answer = new int[expired_cnt];

        int idx = 0;
        int idx2 = 1;
        for (int result : tmp_result) {
            if (today_total > result) {
                answer[idx] = idx2;
                idx++;
            }
            idx2++;
        }
        return answer;
    }

    public static void main(String[] args) {
//        String today = "2022.05.19";
//        String[] terms = {"A 6", "B 12", "C 3"};
//        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
//        String today = "2022.02.28";
//        String[] terms = {"A 23"};
//        String[] privacies = {"2020.01.28 A"};
        String today = "2019.01.01";
        String[] terms = {"B 12"};
        String[] privacies = {"2017.12.21 B"};
        int[] result = solution(today, terms, privacies);
        System.out.println(Arrays.toString(result));
    }
}