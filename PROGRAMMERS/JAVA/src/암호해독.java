public class 암호해독 {
    public String solution(String cipher, int code) {
        String answer = "";
        char[] str = cipher.toCharArray();
        for (int i = code-1; i < cipher.length(); i += code) {
            answer += str[i];
        }
        return answer;
    }
}
