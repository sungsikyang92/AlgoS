package PG.Lv_1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 예산 {
    public static int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        List<Integer> sum = new ArrayList<>();
        for (int i = 0; i < d.length; i++) {
            sum.add(d[i]);
            if (sum.stream().mapToInt(Integer::intValue).sum() > budget) {
                sum.remove(sum.size()-1);
                break;
            }
        }
        answer = sum.size();
        return answer;
    }

    public static void main(String[] args) {
        int[] d = new int[]{1, 3, 2, 5, 4};
//        int[] d = new int[]{2,2,3,3};
        int result = solution(d, 9);
        System.out.println(result);
    }
}
