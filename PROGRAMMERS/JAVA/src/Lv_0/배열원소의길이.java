package Lv_0;

public class 배열원소의길이 {
    public static int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for (int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].length();
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] strlist = new String[]{"We","are","the","world!"};
        int[] result = solution(strlist);
        for (int n : result) {
            System.out.println(n);
        }
    }
}
