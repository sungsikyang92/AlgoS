package PG.Lv_0;

public class 피자나눠먹기3 {
    public static int solution(int slice, int n) {
        int count = 1;
        int temp=slice;
        while (true) {
            if (temp >= n) {
                return count;
            }
            temp+=slice;
            ++count;
        }
    }
//    public static int cnt_pizza(int ori_cut, int slice, int n) {
//        if (slice == n) {
//            return slice / ori_cut;
//        } else if (slice < n){
//            slice += ori_cut;
//            return cnt_pizza(ori_cut, slice, n);
//        } else if (slice > n) {
//            return slice / ori_cut;
//        }
//        return 0;
//    }
//    public static int solution(int slice, int n) {
//        int answer = 0;
//        int ori_cut = slice;
//        answer = cnt_pizza(ori_cut, slice, n);
//        return answer;
//    }

    public static void main(String[] args) {
        int result = solution(4, 12);
        System.out.println(result);
    }
}
