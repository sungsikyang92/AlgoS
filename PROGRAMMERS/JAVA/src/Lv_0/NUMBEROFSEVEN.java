package Lv_0;

public class NUMBEROFSEVEN {
    public int solution(int[] array) {
        int answer = 0;
        String[] s_array = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            s_array[i] = Integer.toString(array[i]);
        }
        for (String s : s_array) {
            String[] tmp = new String[s.length()];
            tmp = s.split("");
            for (int i = 0; i < s.length(); i++) {
                if (tmp[i].contains("7")) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
