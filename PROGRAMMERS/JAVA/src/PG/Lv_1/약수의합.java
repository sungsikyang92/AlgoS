package PG.Lv_1;

public class 약수의합 {
    public static int solution(int n) {
        int answer = 0;
        for (int i = 1; i < n + 1; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int result = solution(12);
        System.out.println(result);
    }
}
