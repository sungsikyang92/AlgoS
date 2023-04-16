package TT;

public class test2 {
    public static int solution(int n, int k, int[] h) {
        int answer = 0;
        int[] chk = new int[n];
        for (int i = 0; i < n - 2; i++) {
            int cnt_up = 0;
            int cnt_down = 0;
            for (int j = i + 1; j < i + 3; j++) {
                if (chk[i] == 1) {
                    break;
                }
                if (h[i] < h[j]) {
                    cnt_up++;
                    if (cnt_up == k) {
                        answer++;
                        chk[j - 1] = 1;
                        break;
                    }
                } else if (h[i] > h[j]) {
                    cnt_down++;
                    if (cnt_down == k) {
                        answer++;
                        chk[j - 1] = 1;
                        break;
                    }
                }

            }
        }
        if (n % 2 == 0) {
            return answer;
        } else if (chk[n - 2] == 1) {
            answer--;
        }
        return answer;
    }

    public static void main(String[] args) {
//        int n = 6;
//        int k = 2;
//        int[] h = {1, 3, 5, 4, 2, 6};
//        int n = 9;
//        int k = 2;
//        int[] h = {9,5,3,8,7,6,4,2,1};
//        int n = 6;
//        int k = 2;
//        int[] h = {6,3,4,5,1,2};
//        int n = 5;
//        int k = 2;
//        int[] h = {3,4,5,1,2};
//        int n = 6;
//        int k = 2;
//        int[] h = {1,2,3,4,5,6};
//        int n = 5;
//        int k = 2;
//        int[] h = {1,2,3,4,5};
        int n = 6;
        int k = 3;
        int[] h = {6,5,4,3,2,1};
        int result = solution(n, k, h);
        System.out.println("결과는 = "+result);
    }
}
