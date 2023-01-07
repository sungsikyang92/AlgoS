public class 공던지기 {
    public static int solution(int[] numbers, int k) {
        int answer = 0;
        int idx = 0;
        for (int i = 0; i < k -1; i++) {
            idx += 2;
        }
        answer = numbers[idx % numbers.length];
        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4};
        int result = solution(numbers, 2);
        System.out.println(result);
    }
}
