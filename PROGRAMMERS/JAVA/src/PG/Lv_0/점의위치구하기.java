package PG.Lv_0;

public class 점의위치구하기 {
    public int solution(int[] dot) {
        int answer = 0;
        int x = dot[0];
        int y = dot[1];
        if (x > 0 & y > 0) {
            answer = 1;
        } else if (x < 0 & y > 0) {
            answer = 2;
        } else if (x < 0 & y < 0) {
            answer = 3;
        } else {
            answer = 4;
        }
        return answer;
    }
}
