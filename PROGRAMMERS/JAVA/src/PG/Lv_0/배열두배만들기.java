package PG.Lv_0;

public class 배열두배만들기 {
    public static int[] solution(int[] numbers) {
        int[] answer = numbers;
        for (int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i] * 2;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{1,2,3,4,5};
        int[] result = solution(numbers);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
