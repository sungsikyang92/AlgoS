package PG.Lv_0;

public class 두수의나눗셈 {
    public static int solution(int num1, int num2) {
        double answer = (double) num1/num2 * 1000;
        return (int)answer;
    }

    public static void main(String[] args) {
        int result = solution(3, 2);
        System.out.println(result);
    }
}
