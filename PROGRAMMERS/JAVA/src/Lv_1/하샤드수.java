package Lv_1;

public class 하샤드수 {
//    public boolean solution(int x) {
//        boolean answer = false;
//        int tmp = 0;
//        String[] arr = Integer.toString(x).split("");
//        for (String ar : arr) {
//            tmp += Integer.parseInt(ar);
//        }
//        if (x % tmp == 0) {
//            answer = true;
//        }
//        return answer;
//    }
    public static boolean solution(int x) {
        boolean answer = false;
        int tmp = 0;
        int copied_x = x;
        while (copied_x > 0) {
            tmp += copied_x % 10;
            copied_x = copied_x / 10;
        }
        if (x % tmp == 0) {
            answer = true;
        }
        return answer;
    }

    public static void main(String[] args) {
        boolean result = solution(10);
        System.out.println(result);
    }
}
