package Lv_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 다트게임 {
    public static int solution(String dartResult) {
        int answer = 0;
        char[] dR = dartResult.toCharArray();
        int tmp = Integer.parseInt(String.valueOf(dR[0]));
        int[] dR_tmp = new int[3];
        int idx = 0;
        for (int i = 1; i < dartResult.length(); i++) {
            if (Character.isDigit(dR[i])) {
                dR_tmp[idx] = tmp;
                tmp = 0;
                idx++;
                tmp += Integer.parseInt(String.valueOf(dR[i]));
            } else if (!Character.isDigit(dR[i])){
                if (Character.isLetter(dR[i])) {
                    if (dR[i] == 'S') {
                        tmp *= Math.pow(tmp, 1);
                    } else if (dR[i] == 'D') {
                        tmp *= Math.pow(tmp, 2);
                    } else if (dR[i] == 'T') {
                        tmp *= Math.pow(tmp, 3);
                    }
                } else if (dR[i] == '*') {
                    if (idx == 0) {
                        tmp *= 2;
                    } else {
                        dR_tmp[idx - 1] *= 2;
                        tmp *= 2;
                    }
                } else if (dR[i] == '#') {
                    tmp *= -1;
                }
            }
        }
        dR_tmp[dR_tmp.length - 1] = tmp;
        System.out.println(Arrays.toString(dR_tmp));
        answer = Arrays.stream(dR_tmp).sum();
        return answer;
    }

    public static void main(String[] args) {
        String dartResult = "1S2D*3T";
        int result = solution(dartResult);
        System.out.println(result);
    }
}
