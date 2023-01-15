public class 다음에올숫자 {
    public int solution(int[] common) {
        int answer = 0;
        int[] nums = new int[common.length - 1];
        for (int i = 1; i < common.length; i++) {
            nums[i - 1] = common[i] - common[i - 1];
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {

            }
        }
        return answer;
    }
}
