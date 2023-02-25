package PG.Lv_1;

public class 최대공약수와최소공배수 {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    public static int[] solution(int n, int m) {
        int[] answer = new int[2];
        //BigInteger 방법
//        BigInteger a = BigInteger.valueOf(n);
//        BigInteger b = BigInteger.valueOf(m);
//        BigInteger gcd = a.gcd(b);
//        answer[0] = gcd.intValue();
//        answer[1] = n * m / gcd.intValue();
//        return answer;
        // 재귀 gcd 방법
        int get_gcd = gcd(n, m);
        answer[0] = get_gcd;
        answer[1] = n * m / get_gcd;
        return answer;
    }

    public static void main(String[] args) {
        int[] result = solution(3, 12);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
