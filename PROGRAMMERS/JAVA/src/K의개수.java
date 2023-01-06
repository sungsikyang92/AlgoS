public class K의개수 {
    public static int solution(int i, int j, int k) {
        int answer = 0;
        String kk = String.valueOf(k);
        for (int l = i; l <= j; l++) {
            if (String.valueOf(l).contains(kk)) {
                String[] str_i = String.valueOf(l).split("");
                for (String str : str_i) {
                    if (str.equals(kk)) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int result = solution(1, 13, 1);
        System.out.println(result);
    }
}
