package Lv_0;

public class 옷가게할인받기 {
    public int solution(int price) {
        double answer = 0;
        if (price >= 500000 & price<=1000000) {
            answer = price * 0.8;
        } else if (price >= 300000) {
            answer = price * 0.9;
        } else if (price >= 100000) {
            answer = price * 0.95;
        } else if (price >=10){
            answer = price;
        }
        int answer2 = (int)answer;
        return answer2;
    }
}
