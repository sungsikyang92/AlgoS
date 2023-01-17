package Lv_0;

public class 유한소수판별하기 {
    public static int GCD(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return GCD(b, a % b);
    }
    public static int solution(int a, int b) {
        int gcd_num = GCD(a, b);
        int btm = b / gcd_num;
        while (btm != 1) {
            if (btm % 2 == 0) {
                btm /= 2;
            } else if (btm % 5 == 0) {
                btm /= 5;
            } else {
                return 2;
            }
        }


        return 1;
    }

    public static void main(String[] args) {
        int result = solution(7, 20);
        System.out.println(result);
    }
}
