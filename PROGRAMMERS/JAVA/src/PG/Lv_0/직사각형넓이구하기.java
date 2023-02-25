package PG.Lv_0;

public class 직사각형넓이구하기 {
    public int solution(int[][] dots) {
        int answer = 0;
        int vertical = 0;
        int horizontal = 0;
        for (int i = 1; i < dots.length; i++) {
                if (dots[0][1] == dots[i][1] && dots[0][0] != dots[i][0]) {
                    vertical = dots[0][0] - dots[i][0];
                } else if (dots[0][0] == dots[i][0] && dots[0][1] != dots[i][1]) {
                    horizontal = dots[0][1] - dots[i][1];
                }
        }
        answer = Math.abs(vertical) * Math.abs(horizontal);
        return answer;
    }
}
