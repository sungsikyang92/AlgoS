package Lv_0;

public class 숫자찾기 {
    public int solution(int num, int k) {
        int answer = -1;
        String tmp = Integer.toString(num);
        char[] tmp2 = tmp.toCharArray();
        for (int i = 0; i < tmp2.length; i++) {
            if (Integer.parseInt(String.valueOf(tmp2[i])) == k) {
                answer = i + 1;
                break;
            }
        }
        System.out.println();
        return answer;
    }
}
