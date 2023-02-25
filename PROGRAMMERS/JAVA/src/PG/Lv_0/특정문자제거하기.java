package PG.Lv_0;

public class 특정문자제거하기 {
    public String solution(String my_string, String letter) {
        return my_string.replaceAll(letter, "");
    }
}
