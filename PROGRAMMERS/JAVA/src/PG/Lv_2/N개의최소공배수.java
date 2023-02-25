package PG.Lv_2;

public class N개의최소공배수 {
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    public static int solution(int[] arr) {
        int answer = 0;
        int head = arr[0];
        for (int i = 1; i < arr.length; i++) {
            head = lcm(head, arr[i]);
        }
        answer = head;
        return answer;
    }

    public static void main(String[] args) {
        int result = solution(new int[]{2, 6, 8, 14});
        System.out.println(result);
    }
}
