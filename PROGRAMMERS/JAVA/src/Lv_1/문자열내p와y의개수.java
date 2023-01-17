package Lv_1;

import java.util.Locale;

public class 문자열내p와y의개수 {
    static boolean solution(String s) {
        boolean answer = true;
        s = s.toLowerCase(Locale.ROOT);
        String[] str = s.split("");
        int cnt = 0;
        for (String st : str) {
            if (st.equals("p")) {
                cnt++;
            } else if (st.equals("y")) {
                cnt--;
            }
        }
        if (cnt == 0) {
            answer = true;
        } else {
            answer = false;
        }
        return answer;
    }

    public static void main(String[] args) {
        boolean result = solution("Pyy");
        System.out.println(result);
    }
}
