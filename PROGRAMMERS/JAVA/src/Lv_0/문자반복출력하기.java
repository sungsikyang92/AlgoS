package Lv_0;

public class 문자반복출력하기 {
    public String solution(String my_string, int n) {
        String answer = "";
        char[] word = my_string.toCharArray();
        for (char w : word) {
            for (int i = 0; i < n; i++) {
                answer += w;
            }
        }
        return answer;
    }
}
