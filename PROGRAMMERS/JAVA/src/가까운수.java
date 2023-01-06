import java.util.Arrays;

public class 가까운수 {
    public static int solution(int[] array, int n) {
        int answer = 0;
        int min = 101;
        Arrays.sort(array);
        for (int arr : array) {
            int tmp = Math.abs(arr - n);
            if (tmp < min) {
                min = tmp;
                answer = arr;
            } else if (tmp == min) {
                continue;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] array = new int[]{3, 10, 28};
        int result = solution(array, 20);
        System.out.println(result);
    }
}
