package PG.Lv_1;

public class 소수찾기 {
    public int is_prime(int num) {
        if (num == 2) {
            return 1;
        }
        for (int i = 2; i <= (int) Math.sqrt(num); i++) {
            if (num % i == 0) {
                return 0;
            }
        }
        return 1;
    }
    public int solution(int n) {
        int answer = 0;
        for (int i = 2; i <= n; i++) {
            if (is_prime(i) == 1) {
                answer++;
            }
        }
        return answer;
    }
}
