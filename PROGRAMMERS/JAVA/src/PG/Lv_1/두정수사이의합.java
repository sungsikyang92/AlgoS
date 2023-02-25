package PG.Lv_1;

public class 두정수사이의합 {
    public static long solution(int a, int b) {
        long answer = 0;
        if (a < b) {
            for (int i = a; i <= b; i++) {
                answer += i;
            }
        }
        if (a == b) {
            answer = a;
        }
        if (a > b) {
            for (int i = a; i >= b; i--) {
                answer += i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        long result = solution(3, 5);

    }
}
