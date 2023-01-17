package Lv_0;

public class 배열의유사도 {
    public static int solution(String[] s1, String[] s2) {
        int answer = 0;
        for (String str : s1) {
            for (String str2 : s2) {
                if (str.equals(str2)) {
                    answer += 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] s1 = new String[]{"a", "b", "c"};
        String[] s2 = new String[]{"com", "b", "d","p","c"};
        int result = solution(s1, s2);
        System.out.println(result);
    }
}
