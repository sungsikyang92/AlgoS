package PG.Lv_2;

public class 이진변환반복하기 {
    public static int[] solution(String s) {
        int[] answer = new int[2];
        int cnt = 0;
        int cnt2 = 0;

        while (true) {
            if (s.equals("1")) {
                break;
            }
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    cnt2++;
                }
            }
            s = s.replace("0", "");
            int c = s.length();
            s = Integer.toBinaryString(c);
            cnt++;
        }
        answer[0] = cnt;
        answer[1] = cnt2;
        return answer;
    }

    public static void main(String[] args) {
        int[] result = solution("110010101001");
    }
}
