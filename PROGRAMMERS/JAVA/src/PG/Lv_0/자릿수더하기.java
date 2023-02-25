package PG.Lv_0;

public class 자릿수더하기 {
    public int solution(int n) {
        int answer = 0;
        String num = Integer.toString(n);
        for (int i = 0; i < num.length(); i++) {
            answer += Integer.parseInt(num.substring(i, i + 1));
        }
        return answer;
    }
}
