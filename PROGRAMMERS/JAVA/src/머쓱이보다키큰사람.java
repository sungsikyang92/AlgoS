import java.util.Arrays;

public class 머쓱이보다키큰사람 {
    public static int solution(int[] array, int height) {
        int answer = 0;
        for (int n : array) {
            if (n > height) {
                answer ++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] array = new int[]{149, 180, 192, 170};
        int height = 167;
        int result = solution(array, height);
        System.out.println(result);
    }
}
