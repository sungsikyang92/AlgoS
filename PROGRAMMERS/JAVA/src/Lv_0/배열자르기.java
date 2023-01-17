package Lv_0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 배열자르기 {
    //    public static List<Integer> solution(int[] numbers, int num1, int num2) {
//        List<Integer> list = new ArrayList<>();
//        for (int i = num1; i <= num2; i++) {
//            list.add(numbers[i]);
//        }
//        return list;
//    }
    public int[] solution(int[] numbers, int num1, int num2) {
        return Arrays.copyOfRange(numbers, num1, num2 + 1);
    }
}
