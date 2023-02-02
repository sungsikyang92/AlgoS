package Lv_2;

public class 숫자의표현 {
    public static int solution(int n) {
        int answer = 1;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = 0;
            for (int j = i; j <= n; j++) {
                if (sum == 15) {
                    answer++;
                    break;
                } else if (sum > 15) {
                    break;
                }else{
                    sum += j;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int result = solution(15);
        System.out.println(result);
    }
}
