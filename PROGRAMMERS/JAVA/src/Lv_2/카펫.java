package Lv_2;

import java.util.Arrays;

public class 카펫 {
    public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int col = 0;
        int row = 0;
        int area = brown + yellow;
        for (int i = 3; i <= area; i++) {
            col = i;
            row = area / col;
            if (row < 3) {
                continue;
            }
            if (row >= col && ((col - 2) * (row - 2) == yellow)) {
                answer[0] = row;
                answer[1] = col;
                return answer;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] result = solution(14, 4);
        System.out.println(Arrays.toString(result));
    }
}
