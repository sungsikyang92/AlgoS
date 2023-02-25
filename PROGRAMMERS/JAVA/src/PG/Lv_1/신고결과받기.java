package PG.Lv_1;

import java.util.*;

public class 신고결과받기 {
    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, Integer> reported_times = new HashMap<>();
        Map<String, HashSet<String>> report_user_datail = new HashMap<>();
        Set<String> report_set = new HashSet<>(Arrays.asList(report));

        for (String report_s : report_set) {
            String[] ppl = report_s.split(" ");
            report_user_datail.putIfAbsent(ppl[0], new HashSet<String>(){{add(ppl[1]);}});
            report_user_datail.get(ppl[0]).add(ppl[1]);
            reported_times.put(ppl[1], reported_times.getOrDefault(ppl[1], 0) + 1);
        }

        for (String reported : reported_times.keySet()) {
            int reported_cnt = reported_times.get(reported);
            if (reported_cnt >= k) {
                for (int i = 0; i < id_list.length; i++) {
                    if (report_user_datail.containsKey(id_list[i]) && report_user_datail.get(id_list[i]).contains(reported)) {
                        answer[i]++;
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
//        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
//        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
//        int k = 2;
        String[] id_list = {"con", "ryan"};
        String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int k = 3;
        int[] result = solution(id_list, report, k);
        System.out.println(Arrays.toString(result));
    }
}
