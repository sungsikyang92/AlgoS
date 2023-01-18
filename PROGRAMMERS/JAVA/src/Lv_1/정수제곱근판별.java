package Lv_1;

//public class 정수제곱근판별 {
//    public static long solution(long n) {
//        long answer = -1;
//        int tmp = 0;
//        for (int i = 1; i <= Math.sqrt(n); i++) {
//            tmp = i * i;
//            if (tmp == n) {
//                answer = (i + 1) * (i + 1);
//            }
//            if (tmp > n) {
//                break;
//            }
//        }
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        long result = solution(3);
//        System.out.println(result);
//    }
//}
public class 정수제곱근판별 {
    public long solution(long n) {
        long answer = -1;
        Double sqrt = Math.sqrt(n);
        if (sqrt == sqrt.intValue()) {
            answer = (long)((sqrt + 1) * (sqrt + 1));
        }
        return answer;
    }
}
