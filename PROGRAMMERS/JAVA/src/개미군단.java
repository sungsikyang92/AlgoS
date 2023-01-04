public class 개미군단 {
    public static int solution(int hp) {
        int answer = 0;
        int General = 5;
        int Soldier = 3;
        int worker = 1;
        answer += hp / General;
        hp = hp % General;
        answer += hp / Soldier;
        hp = hp % Soldier;
        answer += hp / worker;
        return answer;
    }

    public static void main(String[] args) {
        int result = solution(23);
        System.out.println(result);
    }
}
