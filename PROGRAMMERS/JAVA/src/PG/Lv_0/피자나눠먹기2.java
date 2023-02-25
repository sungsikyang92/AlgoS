package PG.Lv_0;

public class 피자나눠먹기2 {
    static int pizza_piece = 6;
    public static int pizza_cnt(int n) {

        if (pizza_piece % n == 0) {
            return pizza_piece / 6;
        } else {
            pizza_piece += 6;
            return pizza_cnt(n);
        }
    }

    public static int solution(int n) {
        int answer = 0;
        answer = pizza_cnt(n);
        return answer;
    }

    public static void main(String[] args) {
        int result = solution(4);
        System.out.println(result);
    }
}