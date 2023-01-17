package Lv_0;

public class 한번만등장한문자 {
    public static String solution(String s) {
        String answer = "";
        int[] alphabet_list = new int[26];
        for (int i = 0; i < s.length(); i++) {
            alphabet_list[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < alphabet_list.length; i++) {
            if (alphabet_list[i] == 1) {
                answer += (char) (i + 'a');
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String result = solution("hello");
        System.out.println(result);
    }
}
