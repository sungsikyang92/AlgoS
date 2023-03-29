package PG.Lv_2;

import java.util.*;

public class 오픈채팅방 {
    public static String[] solution(String[] record) {
        Map<String, String> changed = new HashMap<>();
        for (String re : record) {
            String[] tmp = re.split(" ");
            if (re.contains("Enter") || re.contains("Change")) {
                changed.put(tmp[1], tmp[2]);
            }
        }
        List<String> tmp_answer = new ArrayList<>();
        for (int i = 0; i < record.length; i++) {
            String[] tmp = record[i].split(" ");
            if (record[i].contains("Enter") || record[i].contains("Change")) {
                tmp_answer.add(tmp[0] + " " + tmp[1] + " " + changed.get(tmp[1]));
            } else {
                tmp_answer.add(tmp[0] + " " + tmp[1]);
            }
        }
        int idx = 0;
        for (String a : tmp_answer) {
            if (!a.contains("Change")) {
                idx++;
            }
        }

        String[] answer = new String[idx];
        int num = 0;
        for (String a : tmp_answer) {
            String[] tmp = a.split(" ");
            if (a.contains("Enter")) {
                answer[num] = changed.get(tmp[1]) + "님이 들어왔습니다.";
                num++;
            } else if (a.contains("Leave")) {
                answer[num] = changed.get(tmp[1]) + "님이 나갔습니다.";
                num++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        String[] result = solution(record);
        System.out.println("결과는 = " + result);
    }
}
