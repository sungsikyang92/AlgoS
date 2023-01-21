package Lv_1;

public class 삼진법뒤집기 {
    public static int solution(int n) {
        int answer = 0;
        String tmp = "";
        int num = n;
        while (num > 0) {
            tmp = tmp + (num % 3);
            num /= 3;
        }
        answer = Integer.parseInt(tmp, 3);
        return answer;
    }

    public static void main(String[] args) {
        int result = solution(45);
        System.out.println(result);
    }
}
