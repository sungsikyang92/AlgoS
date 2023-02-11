package Lv_2;

import java.util.LinkedList;
import java.util.Stack;

public class lv2test {
    public static boolean chking(LinkedList<Character> queue) {
        Stack<String> stk = new Stack<>();
        if (queue.getFirst() == ']' || queue.getFirst() == '}' || queue.getFirst() == ')') {
            return false;
        } else if (queue.getLast() == '[' || queue.getLast() == '{' || queue.getLast() == '(') {
            return false;
        } else {
            for (int i = 0; i < queue.size(); i++) {
                if (queue.get(i) == '[') {
                    stk.add("[");
                } else if (queue.get(i) == '{') {
                    stk.add("{");
                } else if (queue.get(i) == '(') {
                    stk.add("(");
                } else if (queue.get(i) == ']') {
                    if (stk.isEmpty()) {
                        return false;
                    } else if (stk.peek() != "[") return false;
                    stk.pop();
                } else if (queue.get(i) == '}') {
                    if (stk.isEmpty()) {
                        return false;
                    }else if (stk.peek() != "{") {
                        return false;
                    }
                    stk.pop();
                } else if (queue.get(i) == ')') {
                    if (stk.isEmpty()) {
                        return false;
                    }else if (stk.peek() != "(") {
                        return false;
                    }
                    stk.pop();
                }
            }
        }
        if (!stk.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
    public static int solution(String s) {
        int answer = 0;
        if (s.length() % 2 == 1) {
            return 0;
        }
        LinkedList<Character> queue = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            queue.add(s.charAt(i));
        }
        for (int i = 0; i < s.length(); i++) {
            if (chking(queue)) {
                answer++;
            }
            char first = queue.getFirst();
            queue.poll();
            queue.add(first);
        }
        return answer;
    }


    public static void main(String[] args) {
        String s = "[](){}";
//        String s = "}]()[{";
        int result = solution(s);
        System.out.println(result);
    }
}
