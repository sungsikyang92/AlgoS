package PG.Lv_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class k진수에서소수개수구하기 {
    public static int isPrime(Long num) {
        if (num == 1) {
            return 0;
        }
        if (num == 2) {
            return 1;
        }
        for (int i = 2; i <= (int) Math.sqrt(num); i++) {
            if (num % i == 0) {
                return 0;
            }
        }
        return 1;
    }
    public static int solution(int n, int k) {
        int answer = 0;
        System.out.println(Integer.toString(n,k));
        String nums = Integer.toString(n, k);
        String[] tmp = nums.split("0");
        System.out.println(Arrays.toString(tmp));
        for (int i = 0; i < tmp.length; i++) {
            if (tmp[i].matches(".*\\d+.*")) {
                if (isPrime(Long.parseLong(tmp[i])) == 1) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
//        int n = 437674;
        int n = 110011;
//        int k = 3;
        int k = 10;
        int result = solution(n, k);
        System.out.println("결과는 = " + result);
    }
}