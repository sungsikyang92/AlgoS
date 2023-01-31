package Lv_1;

public class 신규아이디추천 {
    public static String solution(String new_id) {
        String answer = "";
        new_id = new_id.toLowerCase();
        new_id = new_id.replaceAll("[^-_.a-z0-9]", "");
        new_id = new_id.replaceAll("[.]{2,}", ".");
        new_id = new_id.replaceAll("^[.]|[.]$", "");
        if (new_id.equals("")) {
            new_id = "a";
        }
        if (new_id.length() >= 16) {
            new_id = new_id.substring(0, 15);
            new_id = new_id.replaceAll("[.]$", "");
        }
        if (new_id.length() <= 2) {
            while (new_id.length() < 3) {
                new_id += new_id.charAt(new_id.length() - 1);
            }
        }
        answer = new_id;
        return answer;
    }

    public static void main(String[] args) {
//        String result = solution("...!@BaT#*..y.abcdefghijklm");
        String result = solution("z-+.^.");
//        String result = solution("123_.def");
//        String result = solution();
//        String result = solution();
//        String result = solution();
        System.out.println(result);
    }
}
