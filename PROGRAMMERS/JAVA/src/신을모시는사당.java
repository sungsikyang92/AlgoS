import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
import java.util.stream.Stream;

public class 신을모시는사당 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        N = sc.nextInt();
        sc.nextLine();
        String stt = sc.nextLine();
        String[] Stone = stt.split(" ");
        int[] Stone_Statues = Stream.of(Stone).mapToInt(Integer::parseInt).toArray();
        Stack<Integer> stack = new Stack<>();
        int[] L_R_statue_cnt = new int[2];
        Arrays.fill(L_R_statue_cnt, 0);
        int tmp = 0;
        stack.push(Stone_Statues[0]);
        if (N == 1) {
            System.out.println(1);
        } else {

            for (int i = 1; i < N; i++) {
                if (Stone_Statues[i] == Stone_Statues[i - 1]) {
                    stack.push(Stone_Statues[i]);
                } else {
//                if (stack.size() == 1) {
//                    stack.clear();
//                } else {
                    tmp = stack.size();
                    if (stack.contains(1)) {
                        if (tmp > L_R_statue_cnt[0]) {
                            L_R_statue_cnt[0] = tmp;
                        }
                    } else {
                        if (tmp > L_R_statue_cnt[1]) {
                            L_R_statue_cnt[1] = tmp;
                        }
                    }
                    stack.clear();
                    stack.push(Stone_Statues[i]);
//                }
                }
            }
            System.out.println(L_R_statue_cnt[0] - L_R_statue_cnt[1]);
        }
    }
}
