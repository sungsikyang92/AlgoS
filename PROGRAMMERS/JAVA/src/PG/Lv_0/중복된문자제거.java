package PG.Lv_0;

import java.util.*;

//public class 중복된문자제거 {
//    public String solution(String my_string) {
//        char[] str = my_string.toCharArray();
//        List<String> arr = new ArrayList<>();
//        for (int i = 0; i < str.length; i++) {
//            if (!arr.contains(str[i])) {
//                arr.add(String.valueOf(str[i]));
//            }
//        }
//        return String.join("",arr);
//    }
//}

public class 중복된문자제거 {
    public String solution(String my_string) {
        String[] answer = my_string.split("");
        Set<String> set = new LinkedHashSet<>(Arrays.asList(answer));

        return String.join("", set);
    }
}