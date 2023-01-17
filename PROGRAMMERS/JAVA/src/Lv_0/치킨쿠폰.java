package Lv_0;

public class 치킨쿠폰 {
    public static int solution(int chicken) {
        int answer = 0;
        int cpn = 0;
        int chic_count = 0;
        while (chicken >= 10) {
            chic_count = chicken / 10;
            cpn = chicken % 10;
            chicken = chic_count + cpn;
            answer += chic_count;
        }

        return answer;
    }

    public static void main(String[] args) {
        int result = solution(1999);
        System.out.println(result);
    }
}
