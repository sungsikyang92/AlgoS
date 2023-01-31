package Lv_1;

public class 문자열나누기 {
    public static int solution(String s) {
        int answer = 0;
        String std_word = String.valueOf(s.charAt(0));
        int cnt = 1;
        for (int i = 1; i < s.length(); i++) {
            if (cnt == 0) {
                cnt = 1;
                answer++;
                std_word = String.valueOf(s.charAt(i));
            } else {
                if (String.valueOf(s.charAt(i)).equals(std_word)) {
                    cnt++;
                } else {
                    cnt--;
                }
            }
        }
        answer++;
        return answer;
    }

    public static void main(String[] args) {
//        int result = solution("banana");
        int result = solution("aaabbaccccabba");
        System.out.println("결과: " + result);
    }
}
