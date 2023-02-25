package PG.Lv_2;

public class 다음큰숫자 {
    public static int solution(int n) {
        int answer = 0;
        int cnt = 0;
        int num = n;
        int cnt2 = 0;
        String n_to_bin = Integer.toBinaryString(n);
        char[] n_bin = n_to_bin.toCharArray();
        for (int i = 0; i < n_bin.length; i++) {
            if (n_bin[i] == '1') {
                cnt++;
            }
        }
        while (true) {
            num++;
            String n2_bin = Integer.toBinaryString(num);
            char[] n2_bin_char = n2_bin.toCharArray();
            for (int i = 0; i < n2_bin_char.length; i++) {
                if (n2_bin_char[i] == '1') {
                    cnt2++;
                }
            }
            if (cnt2 != cnt) {
                cnt2 = 0;
            }
            if (cnt2 == cnt) {
                break;
            }
        }
        answer = num;
        return answer;
    }

    public static void main(String[] args) {
        int result = solution(78);
        System.out.println(result);
    }
}
