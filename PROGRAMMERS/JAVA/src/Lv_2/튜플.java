package Lv_2;

import java.util.*;

public class 튜플 {
    public static int[] solution(String s) {
        String[] s1 = s.split("},");
        for (int i = 0; i < s1.length; i++) {
            s1[i] = s1[i].replace("{", "").replace("}","");
        }
        HashMap<Integer, Integer> list = new HashMap<>();
        for (int i = 0; i < s1.length; i++) {
            String[] s2 = s1[i].split(",");
            for (int j = 0; j < s2.length; j++) {
                list.put(Integer.parseInt(s2[j]), list.getOrDefault(Integer.parseInt(s2[j]), 0) + 1);
            }
        }
        List<Map.Entry<Integer, Integer>> list2 = new ArrayList<>(list.entrySet());
        Collections.sort(list2, (o1, o2) -> {
            return o2.getValue().compareTo(o1.getValue());});
        int[] answer = new int[list2.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list2.get(i).getKey();
        }
        return answer;
    }

    public static void main(String[] args) {
//        String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
        String s = "{{20,111},{111}}";
//        String s = "{{1,2,3},{2,1},{1,2,4,3},{2}}";
        int[] result = solution(s);
        System.out.println(Arrays.toString(result));
    }
}
