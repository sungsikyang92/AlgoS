package Lv_1;

public class 삼총사 {
    public static int solution(int[] number) {
        int answer = 0;
        int cnt = 0;
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                for (int k = j + 1; k < number.length; k++) {
                    if (number[i] + number[j] + number[k] == 0) {
                        cnt++;
                    }
                }
            }
        }
        answer = cnt;
        return answer;
    }

    public static void main(String[] args) {
        int[] number = new int[]{-2, 3, 0, 2, -5};
        int result = solution(number);
        System.out.println(result);
    }
}
