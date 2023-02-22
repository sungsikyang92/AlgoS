package Lv_2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 전화번호목록 {
    public static boolean solution(String[] phone_book) {
        boolean answer = true;
        Map<String, String> map = new HashMap<String, String>();

        for(int i=0; i<phone_book.length; i++){
            map.put(phone_book[i], "number");
        }

        for(String cellNumber:phone_book){
            for(int i=0; i<cellNumber.length(); i++){
                if(map.containsKey(cellNumber.substring(0,i))){
                    answer = false;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
//        String[] phone_book = {"119", "97674223", "1195524421"};
//        String[] phone_book = {"123","456","789"};
        String[] phone_book = {"12","123","1235","567","88"};
        boolean result = solution(phone_book);
        System.out.println("결과는 = " + result);
    }
}
