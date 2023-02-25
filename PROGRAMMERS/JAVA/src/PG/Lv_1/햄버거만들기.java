package PG.Lv_1;

import java.util.Stack;

public class 햄버거만들기 {
    public static int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> burger = new Stack<>();
        for (int i = 0; i < ingredient.length; i++) {
            burger.push(ingredient[i]);
            if (burger.size() >= 4) {
                if (burger.get(burger.size() - 1) == 1 && burger.get(burger.size() - 2) == 3 && burger.get(burger.size() - 3) == 2 && burger.get(burger.size() - 4) == 1) {
                    burger.pop();
                    burger.pop();
                    burger.pop();
                    burger.pop();
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
        int result = solution(ingredient);
        System.out.println(result);
    }
}
