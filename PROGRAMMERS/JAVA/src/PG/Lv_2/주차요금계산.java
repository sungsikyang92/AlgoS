package PG.Lv_2;

import java.util.*;

public class 주차요금계산 {
    public static int[] solution(int[] fees, String[] records) {
        Map<String, Integer> parkingTimeByCar = new HashMap<>();
        Map<String, Integer> inAndOut = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        parkingTimeByCar = new HashMap<>();
        int parkingTime = 0;
        for (int i = 0; i < records.length; i++) {
            String[] info = records[i].split(" ");
            if (inAndOut.containsKey(info[1])) {
                Integer inTime = inAndOut.get(info[1]);
                Integer outTime = timeToMin(info[0]);
                parkingTime = outTime - inTime;
                parkingTimeByCar.put(info[1], parkingTimeByCar.getOrDefault(info[1], 0) + parkingTime);
                inAndOut.remove(info[1]);
            } else {
                inAndOut.put(info[1], timeToMin(info[0]));
            }
        }
        Iterator<String> keys = inAndOut.keySet().iterator();
        if (!inAndOut.isEmpty()) {
            while (keys.hasNext()) {
                String key = keys.next();
                Integer inTime = inAndOut.get(key);
                Integer outTime = (23 * 60) + 59;
                parkingTime = outTime - inTime;
                parkingTimeByCar.put(key, parkingTimeByCar.getOrDefault(key, 0) + parkingTime);
            }
        }

        int[] answer = new int[parkingTimeByCar.size()];

        List<Map.Entry<String, Integer>> ptbc = new ArrayList<>(parkingTimeByCar.entrySet());
        Collections.sort(ptbc, (o1, o2) -> {
            return Integer.parseInt(o1.getKey()) > Integer.parseInt(o2.getKey()) ? 1 : Integer.parseInt(o1.getKey()) < Integer.parseInt(o2.getKey()) ? -1 : 0;});
        for (int i = 0; i < answer.length; i++) {
            if (ptbc.get(i).getValue() > fees[0]) {
                answer[i] = fees[1] + (int) Math.ceil((ptbc.get(i).getValue() - fees[0]) / (double)fees[2]) * fees[3];
            }else{
                answer[i] = fees[1];
            }
        }
//        Iterator<String> keys2 = parkingTimeByCar.keySet().iterator();
//        int idx = 0;
//        while (keys2.hasNext()) {
//            String key = keys2.next();
//            System.out.println(key);
//            answer[idx] = fees[1] + ((int) Math.ceil((parkingTimeByCar.get(key) - fees[0])/fees[2]) * fees[3]);
//            idx++;
//        }
        return answer;
    }
    public static int timeToMin(String time) {
        String[] hhmm = time.split(":");
        return (Integer.parseInt(hhmm[0]) * 60) + Integer.parseInt(hhmm[1]);
    }

    public static void main(String[] args) {
        int[] fees = {180, 5000, 10, 600};
        String[] records = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};
        int[] result = solution(fees, records);
        System.out.println("결과는 = " + Arrays.toString(result));
    }
}
