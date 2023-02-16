package Lv_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class 기능개발 {
    public static int[] solution(int[] progresses, int[] speeds) {
        List<Integer> tmp = new ArrayList<>();
        LinkedList<Integer> queue_prog = new LinkedList<>();
        LinkedList<Integer> queue_spd = new LinkedList<>();
        for (int i = 0; i < progresses.length; i++) {
            queue_prog.add(progresses[i]);
            queue_spd.add(speeds[i]);
        }
        int cnt = 0;
        while (!queue_prog.isEmpty()) {
            for (int i = 0; i < queue_prog.size(); i++) {
                queue_prog.set(i, queue_prog.get(i) + queue_spd.get(i));
            }
            for (int i = 0; i < queue_prog.size(); i++) {
                if (queue_prog.get(i) >=  100) {
                    cnt++;
                } else {
                    break;
                }
            }
            tmp.add(cnt);
            for (int i = 0; i < cnt; i++) {
                queue_prog.remove();
                queue_spd.remove();
            }
            cnt = 0;
        }
        int n = 0;
        for (int i = 0; i < tmp.size(); i++) {
            if (tmp.get(i) != 0) {
                n++;
            }
        }
        int[] answer = new int[n];
        int idx = 0;
        for (int i = 0; i < tmp.size(); i++) {
            if (tmp.get(i) != 0) {
                answer[idx] = tmp.get(i);
                idx++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] progresses = {93,30,55};
        int[] speeds = {1,30,5};

        int[] result = solution(progresses, speeds);
        System.out.println(Arrays.toString(result));
    }
}
