package PG.Lv_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class K번째수 {
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            List<Integer> tmp = new ArrayList<>();
            for (int j = commands[i][0]; j <= commands[i][1]; j++) {
                tmp.add(array[j - 1]);
            }
            Collections.sort(tmp);
            answer[i] = tmp.get(commands[i][2] - 1);
            tmp.clear();
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 5, 2, 6, 3, 7, 4};
        int[][] commands = new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] result = solution(array, commands);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
