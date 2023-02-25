package PG.Lv_1;

public class 키패드누르기 {
    public static int comp_dist(int position, int num) {
        return (Math.abs(num-position) / 3) + (Math.abs(num-position) % 3);
    }

    public static String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        int L_position = 10;
        int R_position = 12;
        for (int num : numbers) {
            if (num == 1 || num == 4 || num == 7) {
                answer.append("L");
                L_position = num;
            } else if (num == 3 || num == 6 || num == 9) {
                answer.append("R");
                R_position = num;
            } else {
                if (num == 0) {
                    num = 11;
                }
                if (comp_dist(L_position, num) < comp_dist(R_position, num)) {
                    answer.append("L");
                    L_position = num;
                } else if (comp_dist(L_position, num) > comp_dist(R_position, num)) {
                    answer.append("R");
                    R_position = num;
                } else {
                    if (hand.equals("right")) {
                        answer.append("R");
                        R_position = num;
                    } else {
                        answer.append("L");
                        L_position = num;
                    }
                }
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        String result = solution(numbers, hand);
        System.out.println(result);
    }
}
