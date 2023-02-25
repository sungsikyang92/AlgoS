//import java.util.*;
//
//public class 소인수분해 {
//    public int[] solution(int n) {
//        int[] answer = {};
//        List<Integer> list = new ArrayList<>();
//        int i = 2;
//        while (n >= 2) {
//            if (n % i == 0) {
//                list.add(i);
//                n /= i;
//            } else {
//                i++;
//            }
//        }
//        answer = list.stream().distinct().mapToInt(Integer::intValue).toArray();
//        return answer;
//    }
//    public static List<Integer> solution(int n) {
//        List<Integer> answer = new ArrayList<>();
//        int num = 2;
//        while (num >= 2) {
//            if (n % num == 0) {
//                answer.add(num);
//                n /= num;
//            } else {
//                num++;
//            }
//        }
//        Set<Integer> set = new HashSet<>(answer);
//        List<Integer> list = new ArrayList<>(set);
//        return list;
//    }
//
//    public static void main(String[] args) {
//        List<Integer> result = solution(420);
//        System.out.println(result);
//    }
//}
