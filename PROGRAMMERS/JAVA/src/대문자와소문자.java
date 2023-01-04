import java.util.Arrays;

public class 대문자와소문자 {
    public String solution(String my_string) {
        String answer = "";
        char[] str = my_string.toCharArray();
        for (int i = 0; i < my_string.length(); i++) {
            if (Character.isLowerCase(str[i])) {
                answer += Character.toUpperCase(str[i]);
            } else if (Character.isUpperCase(str[i])) {
                answer += Character.toLowerCase(str[i]);
            }
        }
        return answer;
    }
}
