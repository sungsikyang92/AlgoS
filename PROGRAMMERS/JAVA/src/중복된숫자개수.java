public class 중복된숫자개수 {
    public int solution(int[] array, int n) {
        int answer = 0;
        for (int num : array) {
            if (num == n) {
                answer += 1;
            }
        }
        return answer;
    }
}
