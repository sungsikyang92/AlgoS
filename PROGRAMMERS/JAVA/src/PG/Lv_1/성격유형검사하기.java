package PG.Lv_1;

import java.util.HashMap;
import java.util.Map;

public class 성격유형검사하기 {
    public static String solution(String[] survey, int[] choices) {
        String answer = "";
        Map<String, Integer> type_score = new HashMap<>();
        type_score.put("R", 0);
        type_score.put("T", 0);
        type_score.put("C", 0);
        type_score.put("F", 0);
        type_score.put("J", 0);
        type_score.put("M", 0);
        type_score.put("A", 0);
        type_score.put("N", 0);
        for (int i = 0; i < survey.length; i++) {
            String[] type = survey[i].split("");
            if (choices[i] == 1) {
                type_score.put(type[0], type_score.get(type[0]) + 3);
            }
            if (choices[i] == 2) {
                type_score.put(type[0], type_score.get(type[0]) + 2);
            }
            if (choices[i] == 3) {
                type_score.put(type[0], type_score.get(type[0]) + 1);
            }
            if (choices[i] == 4) {
                continue;
            }
            if (choices[i] == 5) {
                type_score.put(type[1], type_score.get(type[1]) + 1);
            }
            if (choices[i] == 6) {
                type_score.put(type[1], type_score.get(type[1]) + 2);
            }
            if (choices[i] == 7) {
                type_score.put(type[1], type_score.get(type[1]) + 3);
            }
        }
        if (type_score.get("R") >= type_score.get("T")) {
            answer += "R";
        } else {
            answer += "T";
        }
        if (type_score.get("C") >= type_score.get("F")) {
            answer += "C";
        } else {
            answer += "F";
        }
        if (type_score.get("J") >= type_score.get("M")) {
            answer += "J";
        } else {
            answer += "M";
        }
        if (type_score.get("A") >= type_score.get("N")) {
            answer += "A";
        } else {
            answer += "N";
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5, 3, 2, 7, 5};
        String result = solution(survey, choices);
        System.out.println(result);
    }
}
