package PG.Lv_1;

public class 로또의최고순위와최저순위 {
    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int cnt_match = 0;
        int cnt_zero = 0;
        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                cnt_zero++;
            }
            for (int j = 0; j < lottos.length; j++) {
                if (lottos[i] == win_nums[j]) {
                    cnt_match++;
                }
            }
        }
        answer[0] = cnt_match + cnt_zero;
        answer[1] = cnt_match;
        for (int i = 0; i < answer.length; i++) {
            if (answer[i] == 6) {
                answer[i] = 1;
            } else if (answer[i] == 5) {
                answer[i] = 2;
            } else if (answer[i] == 4) {
                answer[i] = 3;
            } else if (answer[i] == 3) {
                answer[i] = 4;
            } else if (answer[i] == 2) {
                answer[i] = 5;
            } else {
                answer[i] = 6;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] lottos = new int[]{44, 1, 0, 0, 31, 25};
        int[] win_nums = new int[]{31, 10, 45, 1, 6, 19};
        int[] result = solution(lottos, win_nums);
    }
}
