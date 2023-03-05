package PG.Lv_2;

import java.util.*;

public class 더맵게 {
    public static int solution(int[] scoville, int k) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int sc : scoville) {
            pq.add(sc);
        }
        while (pq.peek() < k) {
            if (pq.size() == 1) {
                return -1;
            }
            pq.add(pq.poll() + pq.poll() * 2);
            answer++;
        }
        return answer;
    }



    public static void main(String[] args) {
        int[] scoville = {1, 2, 3, 8, 10, 12};
        int k = 7;
        int result = solution(scoville, k);
        System.out.println("결과는 = " + result);
    }
}
