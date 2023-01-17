package Lv_0;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
import java.util.stream.Stream;

public class 신을모시는사당 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String Statue = sc.nextLine();
        String[] Statue_split = Statue.split(" ");
        int[] Stone_Statues = Stream.of(Statue_split).mapToInt(Integer::parseInt).toArray();
        Stack<Integer> stack = new Stack<>();
        int[] L_R_cnt = new int[2];
        Arrays.fill(L_R_cnt, 0);
        int tmp = 0;
        int round = 1;
        if (N == 1) {
            System.out.println(1);
        } else {
            stack.push(Stone_Statues[0]);
            for (int i = 1; i < N; i++) {
                if (Stone_Statues[i] == Stone_Statues[i - 1]) {
                    stack.push(Stone_Statues[i]);
                } else {
                    tmp = 0;
                    tmp = stack.size();
                    round++;
                    if (stack.contains(1)) {
                        if (tmp > L_R_cnt[0]) {
                            L_R_cnt[0] = tmp;
                        }
                    } else {
                        if (tmp > L_R_cnt[1]) {
                            L_R_cnt[1] = tmp;
                        }
                    }
                    stack.clear();
                    stack.push(Stone_Statues[i]);
                }
            }
            if (L_R_cnt[0] == 1 & L_R_cnt[1] == 1) {
                System.out.println(1);
            } else {
                if (L_R_cnt[1] == 1) {
                    System.out.println(L_R_cnt[0]);
                } else {
                    System.out.println(L_R_cnt[0] - L_R_cnt[1]);
                }
            }
        }
    }
}
