package PG.Lv_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class 스킬트리 {
    public static int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for (String st : skill_trees) {
            String st_cpy = st;
            String[] st_arr = st.split("");
            for (int i = 0; i < st_arr.length; i++) {
                if (!skill.contains(st_arr[i])) {
                    st_cpy = st_cpy.replace(st_arr[i], "");
                }
            }
            if (skill.indexOf(st_cpy) == 0) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String skill = "CBD";
        String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
        int result = solution(skill, skill_trees);
        System.out.println("결과는 = " + result);
    }
}
