public class 아이스아메리카노 {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int coffee_price = 5500;
        answer[0] = money / coffee_price;
        answer[1] = money % coffee_price;
        return answer;
    }
}
