package Lv_1;

public class 나머지가1이되는수찾기 {
    public int solution(int n) {
        int answer = 0;
        int tmp = 0;
        while (true) {
            if (n % tmp == 1) {
                break;
            }
            tmp++;
        }
        answer = tmp;
        return answer;
    }
}
