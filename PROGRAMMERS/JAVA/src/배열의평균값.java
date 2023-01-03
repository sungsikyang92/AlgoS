import java.util.Arrays;

public class 배열의평균값 {
    public static double solution(int[] numbers) {
//        double answer = 0;
//        double sum = 0;
//        for (int n : numbers) {
//            sum += n;
//        }
//        answer = sum / numbers.length;
//        return answer;
        //////////////////
        return Arrays.stream(numbers).average().orElse(0);
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double result = solution(numbers);
        System.out.println(result);
    }
}
