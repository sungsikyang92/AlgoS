package Lv_0;

public class 양꼬치 {
    public int solution(int n, int k) {
        int answer = 0;
        int lamb = 12000;
        int coke = 2000;
        answer = n * lamb + coke * k - (n/10 * coke);
        return answer;
    }
}
