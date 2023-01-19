package Lv_1;

public class 콜라츠추측 {
    public int solution(int num) {
        int answer = -1;
        int input_num = num;
        int cnt = 1;
        if (num == 1) {
            return 0;
        }
        for (int i = 0; i < 500; i++) {
            if (input_num % 2 == 0) {
                input_num = input_num / 2;
            } else if (input_num % 2 == 1) {
                input_num = (input_num * 3) + 1;
            }
            if (input_num == 1) {
                answer = cnt;
                break;
            }
            cnt++;
        }
        return answer;
    }
}
