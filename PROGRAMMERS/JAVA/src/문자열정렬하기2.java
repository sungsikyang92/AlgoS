import java.util.Arrays;

public class 문자열정렬하기2 {
    public String solution(String my_string) {
        String answer = "";
        my_string.toLowerCase();
        char[] str = my_string.toCharArray();
        Arrays.sort(str);
        for (char s : str) {
            answer += s;
        }
        return answer;
    }
}
