package Lv_1;

import java.util.Stack;

public class test {
    public static int testing() {
        int[][] board = new int[][]{{0,0,0,0},{0,0,0,0},{0,0,0,0},{1,0,0,2}};
        int[] moves = new int[]{1,2,3,4};
        for (int i = 0; i < moves.length; i++) {
            moves[i] = moves[i] - 1;
        }
        Stack<Integer> stk = new Stack<>();
        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][moves[i]] != 0) {
                    stk.push(board[j][moves[i]]);
                }
            }
        }
        System.out.println(stk);
        System.out.println(stk.peek());
        System.out.println(stk.get(stk.size()-2));
        return 0;
    }

    public static void main(String[] args) {
        int result = testing();
    }
}
