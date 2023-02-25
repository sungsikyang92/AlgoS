package PG.Lv_0;

public class 캐릭터의좌표 {
    public static int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int x_size = (board[0] - 1) / 2;
        int y_size = (board[1] - 1) / 2;
        for (String key : keyinput) {
            if (key.equals("left")) {
                answer[0] -= 1;
            } else if (key.equals("right")) {
                answer[0] += 1;
            } else if (key.equals("down")) {
                answer[1] -= 1;
            } else if (key.equals("up")) {
                answer[1] += 1;
            }
            if (answer[0] > x_size) {
                answer[0] = x_size;
            } else if (answer[0] < -x_size) {
                answer[0] = -x_size;
            } else if (answer[1] > y_size) {
                answer[1] = y_size;
            } else if (answer[1] < -y_size) {
                answer[1] = -y_size;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] keyinput = new String[]{"down", "down", "down", "down", "down"};
        int[] board = new int[]{7,9};
        int[] result = solution(keyinput, board);
        for (int r : result) {
            System.out.println(r);
        }
    }
}
