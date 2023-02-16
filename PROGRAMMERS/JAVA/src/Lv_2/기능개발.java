package Lv_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class 기능개발 {
    public static List<Integer> solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        LinkedList<Integer> queue_prog = new LinkedList<>();
        LinkedList<Integer> queue_spd = new LinkedList<>();
        for (int i = 0; i < progresses.length; i++) {
            queue_prog.add(progresses[i]);
            queue_spd.add(speeds[i]);
        }
        int cnt = 0;
        while (true) {
            if (queue_prog.isEmpty()) {
                break;
            } else {
                for (int i = 0; i < queue_prog.size(); i++) {
                    queue_prog.set(i, queue_prog.get(i) + queue_spd.get(i));

                }
                System.out.println(queue_prog);
                for (int i = 0; i < queue_prog.size(); i++) {
                    if (queue_prog.get(i) == 100) {
                        cnt++;
                    } else {
                        break;
                    }
                }
                System.out.println(cnt);
                answer.add(cnt);
                System.out.println(answer);
                for (int i = 0; i < cnt; i++) {
                    queue_prog.poll();
                    queue_spd.poll();
                }
                cnt = 0;
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        int[] progresses = {93,30,55};
        int[] speeds = {1,30,5};

        List<Integer> result = solution(progresses, speeds);
        System.out.println(result);
    }
}
