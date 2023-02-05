package Lv_2;

import java.util.Arrays;

public class 구명보트 {
    public static int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int idx = 0;
        for (int i = people.length - 1; idx <= i; i--) {
            if (people[idx] + people[i] <= limit) {
                idx++;
            }
            answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] people = {70, 50, 80, 50};
//        int[] people = {70, 50, 80};
        int limit = 100;
        int result = solution(people, limit);
    }
}
