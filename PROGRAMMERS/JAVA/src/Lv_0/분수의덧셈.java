package Lv_0;

public class 분수의덧셈 {
    public static int GCD(int num1, int num2) {
        if (num1 % num2 == 0) {
            return num2;
        }
        return GCD(num2, num1 % num2);
    }

    public static int[] solution(int denum1, int num1, int denum2, int num2) {
        int denum = denum1 * num2 + denum2 * num1;
        int num = num1 * num2;
        int[] answer = new int[]{denum, num};
        int gcd_num = GCD(answer[0], answer[1]);
        answer[0] = denum / gcd_num;
        answer[1] = num / gcd_num;

        return answer;
    }

    public static void main(String[] args) {
        int[] result = solution(1, 2, 3, 4);
        System.out.println(result);
    }
}