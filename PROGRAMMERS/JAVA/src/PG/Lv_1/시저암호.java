package PG.Lv_1;

public class 시저암호 {
    public static String solution(String s, int n) {
        String answer = "";
        char[] s_chr = s.toCharArray();
        for (int i = 0; i < s_chr.length; i++) {
            if (Character.isLetter(s_chr[i])) {
                if (Character.isUpperCase(s_chr[i])) {
                    answer += (char) ((s_chr[i] - 'A' + n) % 26 + 'A');
                } else if (Character.isLowerCase(s_chr[i])) {
                    answer += (char) ((s_chr[i] - 'a' + n) % 26 + 'a');
                }
            } else {
                answer += s_chr[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String result = solution("AB", 1);
        System.out.println(result);
    }
}
