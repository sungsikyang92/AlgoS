package PG.Lv_1;

public class x만큼간격이있는n개의숫자 {
    public long[] solution(int x, int n) {
        long[] answer = {};
        for (int i = 0; i < n; i++) {
            answer[i] += x;
            x += x;
        }
        return answer;
    }
}
