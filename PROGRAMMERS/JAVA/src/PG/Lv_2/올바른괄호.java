package PG.Lv_2;

import java.util.Stack;

public class 올바른괄호 {
    static boolean solution(String s) {
        boolean answer = true;
        Stack<String> stk = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stk.push("(");
            } else {
                if (stk.isEmpty()) {
                    return false;
                } else {
                    stk.pop();
                }
            }
        }
        if (!stk.isEmpty()) {
            return false;
        }
        return answer;
    }

    public static void main(String[] args) {
        boolean result = solution("()()");
        System.out.println(result);
    }
}
