package Lv_1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 완주하지못한선수 {
    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(String save:completion){
            map.put(save,map.getOrDefault(save,0)+1);
        }
        for(String save:participant){
            if(map.containsKey(save)){
                int count = map.get(save) - 1;
                if(count == 0){
                    map.remove(save);
                }else{
                    map.put(save,count);
                }
            }else{
                answer = save;
            }
        }

        return answer;
    }
//    public static String solution(String[] participant, String[] completion) {
//        String answer = "";
//        Arrays.sort(participant);
//        Arrays.sort(completion);
//        System.out.println(Arrays.toString(participant));
//        System.out.println(Arrays.toString(completion));
//        for (int i = 0; i < participant.length; i++) {
//            for (int j = 0; j < completion.length; j++) {
//                if (participant[i].equals(completion[j])) {
//                    participant[i] = "";
//                    completion[j] = "";
//                }
//            }
//        }
//        for (int i = 0; i < participant.length; i++) {
//            if (!participant[i].equals("")) {
//                answer = participant[i];
//            }
//        }
//        return answer;
//    }

    public static void main(String[] args) {
//        String[] participant = new String[]{"leo", "kiki", "eden"};
        String[] participant = new String[]{"mislav", "stanko", "mislav", "ana"};
//        String[] completion = new String[]{"eden", "kiki"};
        String[] completion = new String[]{"stanko", "ana", "mislav"};
        String result = solution(participant, completion);
        System.out.println(result);
    }
}

