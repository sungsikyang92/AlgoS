package PG.Lv_2;

public class 피보나치수 {
    public static int solution(int n) {
        int answer = 0;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            dp[i] = dp[i - 2] + dp[i - 1] % 1234567;
        }
        answer = dp[n] % 1234567;
        return answer;
    }

    public static void main(String[] args) {
        int n = 3;
//        int n = 5;
        int result = solution(n);
        System.out.println("결과는 >>" + result);
    }
}
