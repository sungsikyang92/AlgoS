package Lv_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class 같은숫자는싫어 {
    public static List<Integer> solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        Stack<Integer> tmp = new Stack<>();
        tmp.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (tmp.isEmpty()) {
                tmp.push(arr[i]);
            }
            else if (arr[i] == tmp.get(0)) {
                tmp.push(arr[i]);
            } else {
                answer.add(tmp.pop());
                tmp.clear();
                tmp.push(arr[i]);
            }
        }
        answer.add(tmp.pop());
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 3, 3, 0, 1, 1};
        List<Integer> result = solution(arr);
        System.out.println(result);
    }
}
