package Lv_2;

import java.util.*;

public class lv2test {
    public static int solution(int[] priorities, int location) {
        List<Integer> result = new ArrayList<>();
        List<Integer> result_idx = new ArrayList<>();
        LinkedList<Integer> pq = new LinkedList<>();
        LinkedList<Integer> idx = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            pq.add(priorities[i]);
            idx.add(i);
        }
        int max_num = Integer.MIN_VALUE;
        for (int num : pq) {
            if (num > max_num) {
                max_num = num;
            }
        }
        while (!pq.isEmpty()) {
            for (int i = 0; i < pq.size(); i++) {
                if (pq.peek() < max_num) {
                    pq.add(pq.poll());
                    idx.add(idx.poll());
                } else if (pq.peek() == max_num) {
                    result.add(pq.poll());
                    result_idx.add(idx.poll());
                    if (pq.isEmpty()) {
                        break;
                    } else {
                        max_num = Integer.MIN_VALUE;
                        for (int num : pq) {
                            if (num > max_num) {
                                max_num = num;
                            }
                        }
                    }
                }
            }
        }
        return result_idx.indexOf(location) + 1;
    }

    public static void main(String[] args) {
        int[] priorities = {2, 1, 3, 2};
        int location = 2;
        int result = solution(priorities, location);
        System.out.println(result);
    }
}
