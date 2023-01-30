package Lv_1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 기사단원의무기 {
    public static int get_divisor(int num) {
        int cnt = 0;
        for (int i = 1; i * i < num + 1; i++) {
            if (i * i == num) {
                cnt++;
            } else if ((num) % i == 0) {
                cnt += 2;
            }
        }
        return cnt;
    }
    public static int solution(int number, int limit, int power) {
        int answer = 0;
        int[] member = IntStream.range(0, number + 1).toArray();
        // member의 숫자가 잘 들어갔는지 확인
        System.out.println(Arrays.toString(member));

        for (int i = 0; i < member.length; i++) {
            member[i] = get_divisor(member[i]);
        }
        System.out.println(Arrays.toString(member));
        for (int i = 0; i < member.length; i++) {
            if (member[i] > limit) {
                member[i] = power;
            }
        }
        System.out.println(Arrays.toString(member));
        answer = Arrays.stream(member).sum();
        return answer;
    }

    public static void main(String[] args) {
//        int number = 5, limit = 3, power = 2;
        int number = 10, limit = 3, power = 2;
        int result = solution(number, limit, power);
        System.out.println(result);
    }
}
