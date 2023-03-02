package PG.Lv_2;

import java.util.Arrays;

public class 피로도 {
    public static int answer = 0;
    public static boolean[] visited;
    public static int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        dfs(k, dungeons, 0);
        return answer;
    }

    public static void dfs(int k, int[][] dungeons, int depth) {
        int max_num = Integer.MIN_VALUE;
        for (int i = 0; i < dungeons.length; i++) {
            if (!visited[i] && dungeons[i][0] <= k) {
                visited[i] = true;
                dfs(k - dungeons[i][1], dungeons, depth + 1);
                visited[i] = false;
            }
        }
        answer = Math.max(answer, depth);
    }

    public static void main(String[] args) {
        int k = 80;
        int[][] dungeons = {{80, 20}, {50, 40}, {30, 10}};
        int result = solution(k, dungeons);
        System.out.println(result);
    }
}
