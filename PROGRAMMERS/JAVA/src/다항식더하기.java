import java.util.ArrayList;
import java.util.List;

public class 다항식더하기 {
    public static boolean isNumber(String str) {
        return str != null && str.matches("[-+]?\\d*\\.?\\d+");
    }

    public static String solution(String polynomial) {
        String answer = "";
        String[] tmp = polynomial.split(" ");
        List<String> num = new ArrayList<>();
        List<Integer> num2 = new ArrayList<>();
        for (int i = 0; i < tmp.length; i++) {
            if (tmp[i].startsWith("0")) {
                tmp[i].replace("0", "");
            }
            if (tmp[i].contains("x")) {
                num.add(tmp[i]);
            } else if (isNumber(tmp[i])) {
                num2.add(Integer.parseInt(tmp[i]));
            }
        }
        int tmp_sum = 0;
        for (int i = 0; i < num.size(); i++) {
            if (num.get(i).equals("x")) {
                tmp_sum++;
            } else {
                int tmp_num = Integer.parseInt(num.get(i).replace("x", ""));
                tmp_sum += tmp_num;
            }
        }
        String num_sum = Integer.toString(tmp_sum) + "x";
        int num2_sum = num2.stream().mapToInt(Integer::intValue).sum();
        if (num2_sum == 0) {
            if (num_sum.equals("1x")) {
                answer = "x";
            } else {
                answer = num_sum;
            }
        } else if (num_sum.equals("0x")) {
            answer = Integer.toString(num2_sum);
        } else {
            if (num_sum.equals("1x")) {
                answer = "x + " + Integer.toString(num2_sum);
            } else {
                answer = num_sum + " + " + Integer.toString(num2_sum);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String polynomial = "1 + 1";
        String result = solution(polynomial);
        System.out.println(result);
    }
}
