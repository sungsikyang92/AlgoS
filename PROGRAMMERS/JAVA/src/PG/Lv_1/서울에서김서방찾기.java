package PG.Lv_1;

import java.util.Arrays;

public class 서울에서김서방찾기 {
    public String solution(String[] seoul) {
        String answer = "";
        int loc = Arrays.asList(seoul).indexOf("Kim");
        answer = "김서방은 ";
        answer += Integer.toString(loc);
        answer += "에 있다";
        return answer;
    }
}
