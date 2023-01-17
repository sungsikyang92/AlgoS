import java.util.*;

public class 평행 {
    public static int solution(int[][] dots) {
        int answer = 0;
        List<Double> slope = new ArrayList<>();
        for (int i = 0; i < dots.length; i++) {
            for (int j = i + 1; j < dots.length; j++) {
                slope.add((double)(dots[i][1] - dots[j][1]) / (dots[i][0] - dots[j][0]));
            }
        }
        Set<Double> set = new HashSet<>(slope);
        for (Double s : set) {
            if (Collections.frequency(slope, s) > 1) {
                answer = 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
//        int[][] dots = new int[][]{{1, 4}, {9, 2}, {3, 8}, {11, 6}};
        int[][] dots = new int[][]{{3,5}, {4,1}, {2,4}, {5,10}};
        int result = solution(dots);
        System.out.println(result);
    }
}
