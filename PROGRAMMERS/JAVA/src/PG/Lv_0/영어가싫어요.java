package PG.Lv_0;

public class 영어가싫어요 {
    public static long solution(String numbers) {
        long answer = 0;
        if (numbers.startsWith("zero")) {
            numbers = numbers.replace("zero", "");
        }
        numbers = numbers.replace("one", "1")
                .replace("two", "2")
                .replace("three", "3")
                .replace("four", "4")
                .replace("five", "5")
                .replace("six", "6")
                .replace("seven", "7")
                .replace("eight", "8")
                .replace("nine", "9")
                .replace("zero","0");
        answer = Long.parseLong(numbers);
        return answer;
    }

    public static void main(String[] args) {
        String numbers = "zeroonetwothreefourfivesixseveneightnine";
        long result = solution(numbers);
        System.out.println(result);
    }
}
