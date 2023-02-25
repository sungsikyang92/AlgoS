package PG.Lv_0;

public class 합성수찾기 {
    public static int solution(int n) {
        int answer = 0;
        int[] arr = new int[n+1];
        for (int i =1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i % j == 0) {
                    arr[i]++;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 3) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int result = solution(10);
        System.out.println(result);
    }
}