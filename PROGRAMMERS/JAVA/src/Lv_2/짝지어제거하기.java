package Lv_2;

import java.util.Stack;

public class 짝지어제거하기 {
    public static int solution(String s) {
        int answer = 0;
        Stack<Character> stk = new Stack<>();
        for (char s_char : s.toCharArray()) {
            if (stk.size() == 0) {
                stk.push(s_char);
            } else if (stk.peek() == s_char) {
                stk.pop();
            } else {
                stk.push(s_char);
            }
        }
        if (stk.isEmpty()) {
            answer = 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        int result = solution("baabaa");
        System.out.println(result);
    }
}
