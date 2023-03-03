package PG.Lv_2;

public class N진수게임 {
    public static String solution(int n, int t, int m, int p) {
        String answer = "";
        int len = t * m;
        String number = "";
        int idx = 0;
        while (true) {
            if (number.length() >= len) {
                break;
            }
            number += Integer.toString(idx, n);
            idx++;
        }
        number = number.toUpperCase();
        int order = 1;
        for (int i = 0; i < number.length(); i++) {
            if (order > m) {
                order = 1;
            }
            if (answer.length() < t) {
                if (order == p) {
                    answer += number.charAt(i);
                }
            } else {
                break;
            }
            order++;
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 2;
        int t = 4;
        int m = 2;
        int p = 1;
        String result = solution(n, t, m, p);
        System.out.println("결과는 = " + result);
    }
}
