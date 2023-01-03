public class 배열뒤집기 {
    public int[] solution(int[] num_list) {
        int idx = num_list.length;
        int[] answer = new int[idx];
        for (int n : num_list) {
            answer[idx-1] = n;
            idx--;
        }
        return answer;
    }
}
