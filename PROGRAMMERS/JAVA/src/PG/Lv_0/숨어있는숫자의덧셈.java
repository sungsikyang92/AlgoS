package PG.Lv_0;

public class 숨어있는숫자의덧셈 {
    public static int solution(String my_string) {
        int answer = 0;
        char[] str = my_string.toCharArray();
        for (char c : str) {
            if (Character.isDigit(c)) {
                String num = Character.toString(c);
                answer += Integer.parseInt(num);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int result = solution("aAb1B2cC34oOp");
        System.out.println(result);
    }
}
