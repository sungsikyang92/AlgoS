package PG.Lv_1;

public class 가운데글자가져오기 {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        int mid = s.length() / 2;
        if (s.length() % 2 == 0) {
            answer += str[mid - 1];
            answer += str[mid];
        } else {
            answer += str[mid];
        }
        return answer;
    }
}
