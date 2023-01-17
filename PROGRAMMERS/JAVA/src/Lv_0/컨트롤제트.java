package Lv_0;

public class 컨트롤제트 {
    public static int solution(String s) {
        int answer = 0;
        String[] list = s.split(" ");
        for (int i = 0; i < list.length; i++) {
            if (list[i] == "Z") {
                answer -= Integer.parseInt(list[i - 1]);
            } else {
                answer += Integer.parseInt(list[i]);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String s = "10 20 30 40";
        int result = solution(s);
        System.out.println(result);
    }
}
