package Lv_1;

public class 이상한문자만들기 {
    public static String solution(String s) {
        String answer = "";
        String[] s1 = s.toLowerCase().split("");
        int idx = 0;
        for (int i = 0; i < s1.length; i++) {
            if (!s1[i].equals(" ")) {
                if (idx % 2 == 0) {
                    answer += s1[i].toUpperCase();
                    idx++;
                } else {
                    answer += s1[i];
                    idx++;
                }
            } else {
                idx = 0;
                answer += " ";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String result = solution("try  hello world");
        System.out.println(result);
    }
}
