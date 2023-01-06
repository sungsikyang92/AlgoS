public class 모스부호1 {
    public String solution(String letter) {
        String answer = "";
        String[] morse = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        String[] l = letter.split(" ");
        for (String str : l) {
            for (int i = 0; i < morse.length; i++) {
                if (str.equals(morse[i])) {
                    answer += Character.toString(i + 'a');
                }
            }
        }

        return answer;
    }
}