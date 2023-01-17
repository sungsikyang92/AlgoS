package Lv_0;

public class 짝수는싫어요 {
    public static int[] solution(int n) {
        int[] answer = new int[(n+1)/2];
        int idx = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                answer[idx] = i;
                idx++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] result = solution(10);
        for (int re : result) {
            System.out.println(re);
        }
    }
}
