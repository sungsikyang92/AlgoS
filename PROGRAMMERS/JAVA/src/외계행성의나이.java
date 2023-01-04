public class 외계행성의나이 {
    public String solution(int age) {
        String answer = "";
        String[] age_al = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        String age1 = Integer.toString(age);
        for (int i = 0; i < age1.length(); i++) {
            answer += age_al[Integer.parseInt(age1.substring(i, i + 1))];
        }
        return answer;
    }
}
