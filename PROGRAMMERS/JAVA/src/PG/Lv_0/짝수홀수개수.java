package PG.Lv_0;

public class 짝수홀수개수 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        for (int n : num_list) {
            if (n % 2 == 0) {
                answer[0]++;
            } else {
                answer[1]++;
            }
        }
        return answer;
    }
}
