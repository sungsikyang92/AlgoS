package Lv_0;

import java.util.Stack;

public class 숨어있는숫자의덧셈2 {
    public static int solution(String my_string) {
        int answer = 0;
        Stack<String> num_stack = new Stack<>();
        char[] tmp = my_string.toCharArray();
        for (char t : tmp) {
            if (Character.isLetter(t)) {
                if (num_stack.isEmpty()) {
                    continue;
                } else {
                    answer += Integer.parseInt(String.join("", num_stack));
                    num_stack.clear();
                }
            } else if (Character.isDigit(t)) {
                num_stack.push((String.valueOf(t)));
            }
        }
        if (!num_stack.isEmpty()) {
            answer += Integer.parseInt(String.join("", num_stack));
        }
        return answer;
    }

    public static void main(String[] args) {
        int result = solution("aAb1B2cC34oOp");
        System.out.println(result);
    }
}
