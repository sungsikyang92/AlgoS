public class 이차원으로만들기 {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        int idx0 = 0;
        int idx1 = 0;
        for (int num : num_list) {
            answer[idx0][idx1] = num;
            idx1++;
            if (idx1 == n) {
                idx1 = 0;
                idx0++;
            }
        }
        return answer;
    }
}
