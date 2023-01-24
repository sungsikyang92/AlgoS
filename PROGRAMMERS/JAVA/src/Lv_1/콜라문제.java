package Lv_1;

public class 콜라문제 {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int tmp = 0;
        while (true) {
            if (n < a) break;
            answer += n / a * b;
            tmp = n % a;
            n = (n / a * b) + tmp;
        }
        return answer;
    }
}
