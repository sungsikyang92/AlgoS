package PG.Lv_2;

import java.util.LinkedList;

public class 캐시 {
    public static int solution(int cacheSize, String[] cities) {
        int answer = 0;
        //캐시사이즈가 0일때
        if (cacheSize == 0) {
            return cities.length * 5;
        }
        //큐를 위한 링크드리스트
        LinkedList<String> cache = new LinkedList<>();
        for (int i = 0; i < cities.length; i++) {
            String s = cities[i].toUpperCase();
            //캐시에 존재하면 삭제 후, 다시 add FIFO를 위한 것
            if (cache.remove(s)) {
                //캐시히트
                answer++;
                cache.add(s);
            } else {
                //캐시에 존재하지 않으면 캐시미스
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
    }
}
