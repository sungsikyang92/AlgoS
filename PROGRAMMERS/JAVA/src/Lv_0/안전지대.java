package Lv_0;

public class 안전지대 {
    public static int solution(int[][] board) {
        int answer = 0;
        int[][] bomb_area_chk = new int[board.length + 2][board.length + 2];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 1) {
                    bomb_area_chk[i][j] = 1;
                    bomb_area_chk[i][j + 1] = 1;
                    bomb_area_chk[i][j + 2] = 1;
                    bomb_area_chk[i + 1][j] = 1;
                    bomb_area_chk[i + 1][j + 1] = 1;
                    bomb_area_chk[i + 1][j + 2] = 1;
                    bomb_area_chk[i + 2][j] = 1;
                    bomb_area_chk[i + 2][j + 1] = 1;
                    bomb_area_chk[i + 2][j + 2] = 1;
                }
            }
        }
        for (int i = 1; i < bomb_area_chk.length - 1; i++) {
            for (int j = 1; j < bomb_area_chk.length - 1; j++) {
                if (bomb_area_chk[i][j] == 0) {
                    answer++;
                }
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        int[][] board = new int[][]{{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}};
        int result = solution(board);
        System.out.println(result);
    }
}
