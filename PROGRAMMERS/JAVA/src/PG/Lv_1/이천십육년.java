package PG.Lv_1;

public class 이천십육년 {
    public String solution(int a, int b) {
        int[] arr = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        String answer = "";
        int tmp = 0;
        for (int i = 0; i < a; i++) {
            tmp += arr[i];
        }
        tmp += b - 1;
        tmp %= 7;
        answer = day[tmp];
        return answer;
    }
}
