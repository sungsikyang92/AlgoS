package Lv_1;

public class 비밀지도 {
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[arr1.length];
        String[] tmp = new String[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            tmp[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
            if (tmp[i].length() != n) {
                tmp[i] = "0".repeat(n - tmp[i].length()) + tmp[i];
            }
            tmp[i] = tmp[i].replaceAll("1", "#");
            tmp[i] = tmp[i].replaceAll("0", " ");
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr1 = new int[]{9, 20, 28, 18, 11};
        int[] arr2 = new int[]{30, 1, 21, 17, 28};
        String[] result = solution(n, arr1, arr2);
        for (int i = 0; i < result.length; i++) {
//            System.out.println(result[i]);
        }
    }
}
