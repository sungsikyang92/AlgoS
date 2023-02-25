package PG.Lv_0;

import java.util.ArrayList;
import java.util.List;

public class 잘라서배열로저장하기 {
    public static List<String> solution(String my_str, int n) {
        List<String> answer = new ArrayList<>();
        char[] str = my_str.toCharArray();
        int cnt = 1;

        String tmp = "";
        for (char s : str) {
            tmp += s;
            if (cnt == n) {
                answer.add(tmp);
                cnt = 1;
                tmp = "";
            } else {
                cnt++;
            }
        }
        if (tmp != "") {
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args) {
        String my_str = "abcdef123";
        List<String> result = solution(my_str,3);
        System.out.println(result);
        for (String r : result) {
            System.out.println(r);
        }
    }
}
