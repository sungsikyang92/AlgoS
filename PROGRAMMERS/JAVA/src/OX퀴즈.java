public class OX퀴즈 {
    public static String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {
            String[] quiz_split = quiz[i].split(" ");
            int x = Integer.parseInt(quiz_split[0]);
            int y = Integer.parseInt(quiz_split[2]);
            int z = Integer.parseInt(quiz_split[4]);
            if (quiz_split[1].equals("-")) {
                if (z == x - y) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            } else if (quiz_split[1].equals("+")) {
                if (z == x + y) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] quiz = new String[]{"3 - 4 = -3", "5 + 6 = 11"};
        String[] result = solution(quiz);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
