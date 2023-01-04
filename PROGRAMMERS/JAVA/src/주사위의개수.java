public class 주사위의개수 {
    public int solution(int[] box, int n) {
        int answer = 0;
        int horizontal = box[0];
        int vertical = box[1];
        int height = box[2];
        answer += horizontal / n;
        answer *= vertical / n;
        answer *= height / n;
        return answer;
    }
}
