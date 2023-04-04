package TT;

import java.util.Stack;

public class test1 {
    public static String solution(String S) {
        String answer = "FALSE";
        Stack<String> stk = new Stack<>();
        int idx = 0;
        int sum = 0;

        if (S.startsWith("(") || S.startsWith("{") || S.startsWith("[")) {
            while (idx < S.length()) {
                if (sum < 0) {
                    break;
                }
                if (S.charAt(idx) == '(' || S.charAt(idx) == '{' || S.charAt(idx) == '[') {
                    sum++;
                } else {
                    sum--;
                }
                idx++;
            }
            if (sum == 0) {
                answer = "TRUE";
            } else {
                answer = "FALSE";
            }
        } else {
            answer = "FALSE";
        }
        return answer;
    }

    public static void main(String[] args) {
//        String S = "(){()}[]";
//        String S = "(){}]";
        String S = "[{}]]]((({[{}]})))";
        String result = solution(S);
        System.out.println("결과는 = " + result);

    }
}
