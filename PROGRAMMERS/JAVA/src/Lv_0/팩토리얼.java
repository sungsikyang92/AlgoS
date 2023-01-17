package Lv_0;

public class 팩토리얼 {
    public int factorial(int fac) {
        if (fac == 1) {
            return 1;
        }
        return fac * (factorial(fac - 1));
    }
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= 10; i++) {
            if (n >= factorial(i)) {
                answer = i;
                continue;
            } else {
                break;
            }
        }
        return answer;
    }
}
