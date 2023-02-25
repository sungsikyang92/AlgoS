package PG.Lv_1;

import java.util.Stack;

public class 크레인인형뽑기게임 {
    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        int cnt = 0;
        for (int i = 0; i < moves.length; i++) {
            moves[i] = moves[i] - 1;
        }
        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][moves[i]] != 0) {
                    stack.push(board[j][moves[i]]);
                    board[j][moves[i]] = 0;
                    if (stack.size() > 1) {
                        if (stack.peek() == stack.get(stack.size() - 2)) {
                            stack.pop();
                            stack.pop();
                            cnt += 2;
                        }
                    }
                    break;
                }
            }
        }
        answer = cnt;
        return answer;
    }

    public static void main(String[] args) {
//        int[][] board = new int[][]{{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[][] board = new int[][]{{0,0,0,0},{0,0,0,0},{0,0,0,0},{1,0,0,1}};
//        int[] moves = new int[]{1, 5, 3, 5, 1, 2, 1, 4};
        int[] moves = new int[]{1,2,3,4};
        int result = solution(board, moves);
        System.out.println(result);
    }
}
