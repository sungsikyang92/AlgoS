import java.util.Arrays;

public class 인덱스바꾸기 {
    public static String solution(String my_string, int num1, int num2) {
        String answer = "";
        char[] str = my_string.toCharArray();
        char tmp = ' ';
        tmp = str[num1];
        str[num1] = str[num2];
        str[num2] = tmp;
        for (char x : str) {
            answer += x;
        }
        return answer;
    }

    public static void main(String[] args) {
        String result = solution("hello", 1, 2);
        System.out.println(result);
    }
}
