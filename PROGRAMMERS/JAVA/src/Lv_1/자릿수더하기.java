package Lv_1;

public class 자릿수더하기 {
    public int solution(int n) {
        int answer = 0;
        String str = Integer.toString(n);
        String[] str_arr = str.split("");
        for (int i = 0; i < str.length(); i++) {
            answer += Integer.parseInt(str_arr[i]);
        }
        return answer;
    }
}
