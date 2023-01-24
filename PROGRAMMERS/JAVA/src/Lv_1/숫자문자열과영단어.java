package Lv_1;

import java.util.Stack;

public class 숫자문자열과영단어 {
    public static int solution(String s) {
        int answer = 0;
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] nums = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        char[] s_char = s.toCharArray();
        String tmp = "";
        String tmp_result = "";
        for (int i = 0; i < s_char.length; i++) {
            if (Character.isLetter(s_char[i])) {
                tmp += s_char[i];
                for (int j = 0; j < words.length; j++) {
                    if (tmp.equals(words[j])) {
                        tmp_result += nums[j];
                        tmp = "";
                    }
                }
            } else {
                tmp_result += s_char[i];
            }
        }
        answer = Integer.parseInt(tmp_result);
        return answer;
    }

    public static void main(String[] args) {
        String s = "one4seveneight";
        int result = solution(s);
        System.out.println(result);
    }
}
