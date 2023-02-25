package PG.Lv_1;

import java.util.Arrays;

public class 다트게임 {
    public static int solution(String dartResult) {
        int answer = 0;
        int[] result = new int[3];
        char[] dR = dartResult.toCharArray();
        int idx = 0, num = 0;
        String make_num = "";
        for (int i = 0; i < dartResult.length(); i++) {
            if (dR[i] >= '0' && dR[i] <= '9') {
                make_num += dR[i];
            } else if (Character.isLetter(dR[i])) {
                num = Integer.parseInt(make_num);
                if (dR[i] == 'S') {
                    result[idx++] = (int) Math.pow(num, 1);
                } else if (dR[i] == 'D') {
                    result[idx++] = (int) Math.pow(num, 2);

                } else if (dR[i] == 'T') {
                    result[idx++] = (int) Math.pow(num, 3);
                }
                make_num = "";
            } else {
                if (dR[i] == '*') {
                    result[idx - 1] *= 2;
                    if (idx - 2 >= 0) {
                        result[idx - 2] *= 2;
                    }
                } else {
                    result[idx - 1] *= -1;
                }
            }
        }
        answer = Arrays.stream(result).sum();
        return answer;
    }

    public static void main(String[] args) {
        String dartResult = "1S2D*3T";
//        String dartResult = "1D2S#10S";
//        String dartResult = "10D4S10D";
        int result = solution(dartResult);
        System.out.println(result);
    }
}
