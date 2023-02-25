package PG.Lv_1;

public class 자연수뒤집어배열로만들기 {
    public static int[] solution(long n) {
        String num = Long.valueOf(n).toString();
        String[] num_arr = num.split("");
        int[] answer = new int[num.length()];
        for (int i = 0; i < num_arr.length; i++) {
            answer[i] = Integer.parseInt(num_arr[num_arr.length - i - 1]);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] result = solution(12345);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }
}
