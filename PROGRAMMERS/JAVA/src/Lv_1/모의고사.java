package Lv_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class 모의고사 {
    public static int[] solution(int[] answers) {
        int[] quitter1 = {1, 2, 3, 4, 5};
        int[] quitter2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] quitter3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] scores = new int[3];

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == quitter1[i % 5]) {
                scores[0]++;
            }
            if (answers[i] == quitter2[i % 8]) {
                scores[1]++;
            }
            if (answers[i] == quitter3[i % 10]) {
                scores[2]++;
            }
        }

        int max = Arrays.stream(scores).max().getAsInt();

        List<Integer> aws_tmp = new ArrayList<>();

        for (int i = 0; i < scores.length; i++) {
            if (max == scores[i]) {
                aws_tmp.add(i + 1);
            }
        }

        int[] answer = new int[aws_tmp.size()];
        for (int i = 0; i < aws_tmp.size(); i++) {
            answer[i] = aws_tmp.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] answers = new int[]{1, 2, 3, 4, 5};
        int[] result = solution(answers);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
//    public int[] solution(int[] answers) {
//        int aws_len = answers.length;
//        String quitter1 = "12345";
//        String quitter2 = "21232425";
//        String quitter3 = "3311224455";
//        List<Integer> q1 = null;
//        List<Integer> q2 = null;
//        List<Integer> q3 = null;
//        int[] quitter_max = new int[3];
//        for (int i = 0; i < aws_len; i++) {
//            quitter1 = quitter1.repeat(aws_len / quitter1.length() + 1);
//            String[] tmp = quitter1.split("");
//            q1 = Arrays.stream(tmp).map(s -> Integer.parseInt(s)).collect(Collectors.toList());
//            quitter2 = quitter2.repeat(aws_len / quitter2.length() + 1);
//            tmp = quitter2.split("");
//            q2 = Arrays.stream(tmp).map(s -> Integer.parseInt(s)).collect(Collectors.toList());
//            quitter3 = quitter3.repeat(aws_len / quitter3.length() + 1);
//            tmp = quitter2.split("");
//            q3 = Arrays.stream(tmp).map(s -> Integer.parseInt(s)).collect(Collectors.toList());
//        }
//        for (int i = 0; i < aws_len; i++) {
//            if (answers[i] == q1.get(i)) {
//                quitter_max[0]++;
//            }
//            if (answers[i] == q2.get(i)) {
//                quitter_max[1]++;
//            }
//            if (answers[i] == q3.get(i)) {
//                quitter_max[2]++;
//            }
//        }
//        int max = Arrays.stream(quitter_max).max().getAsInt();
//        List<Integer> answer_tmp = new ArrayList<>();
//        for (int i = 0; i < quitter_max.length; i++) {
//            if (quitter_max[i] == max) {
//                answer_tmp.add(i + 1);
//            }
//        }
//        int[] answer = new int[answer_tmp.size()];
//        for (int i = 0; i < answer_tmp.size(); i++) {
//            answer[i] = answer_tmp.get(i);
//        }
//        return answer;
//    }
}
