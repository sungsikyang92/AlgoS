public class 문자열밀기 {
    public static int solution(String A, String B) {
        int answer = 0;
        String A_copy = A;
        for (int i = 0; i < A.length(); i++) {
            if (A_copy.equals(B)) {
                return answer;
            }
            String tmp = A_copy.substring(A.length() - 1);
            A_copy = tmp + A_copy.substring(0, A.length() - 1);
            answer++;
        }
        return -1;
    }

    public static void main(String[] args) {
        int result = solution("hello", "elloh");
        System.out.println(result);
    }
}
