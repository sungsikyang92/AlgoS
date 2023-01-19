package Lv_1;

public class 없는숫자더하기 {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] chk = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            chk[numbers[i]]++;
        }
        for (int i = 0; i < chk.length; i++) {
            if (chk[i] == 0) {
                answer += i;
            }
        }
        return answer;
    }
}
