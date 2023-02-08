package Lv_2;

import java.util.LinkedList;

public class 캐시 {
    public static int solution(int cacheSize, String[] cities) {
        int answer = 0;
        if (cacheSize == 0) {
            return cities.length * 5;
        }
        LinkedList<String> cache = new LinkedList<>();
        for (int i = 0; i < cities.length; i++) {
            String s = cities[i].toUpperCase();
            if (cache.remove(s)) {
                answer++;
                cache.add(s);
            } else {
                answer += 5;
                if (cache.size() >= cacheSize) {
                    cache.remove(0);
                }
                cache.add(s);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int cacheSize = 3;
        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
        int result = solution(cacheSize, cities);
        System.out.println("결과는" + result);
    }
}
