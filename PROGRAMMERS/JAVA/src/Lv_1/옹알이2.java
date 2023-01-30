package Lv_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 옹알이2 {
    public static int solution(String[] babbling) {
        int answer = 0;
        String[] bab = {"aya", "ye", "woo", "ma"};
        String[] cant_bab = {"ayaaya", "yeye", "woowoo", "mama"};

        for (String babb : babbling) {
            for (String cant : cant_bab) {
                babb = babb.replace(cant, "1");
            }
            for (String ba : bab) {
                babb = babb.replace(ba, "2");
            }
            int flag = 0;
            for (int i = 0; i < babb.length(); i++) {
                if (!babb.substring(i, i + 1).equals("2")) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
//        String[] babbling = new String[]{"aya", "yee", "u", "maa"};
        String[] babbling = new String[]{"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
        int result = solution(babbling);
        System.out.println(result);
    }
}
