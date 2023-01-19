package Lv_1;

public class 문자열다루기기본 {
    public static boolean solution(String s) {
        boolean answer = true;
        if (s.length() < 4) {
            return false;
        } else if (s.length() > 6) {
            return false;
        } else if (s.length() == 5) {
            return false;
        } else {
            char[] s_char = s.toCharArray();
            for (int i = 0; i < s_char.length; i++) {
                if (s_char[i] >= 65 && s_char[i] <= 122) {
                    answer = false;
                    break;
                } else {
                    answer = true;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        boolean result = solution("1234");
        System.out.println(result);
    }
}
